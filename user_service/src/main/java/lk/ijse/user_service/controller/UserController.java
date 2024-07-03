package lk.ijse.user_service.controller;
import lk.ijse.user_service.dto.SingUp;
import lk.ijse.user_service.dto.Ticket;
import lk.ijse.user_service.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private RestTemplate restTemplate;
    @GetMapping("/mg")
    public String message(){
        return "User Service works fine";
    }

    @PostMapping("/signUp")
    public ResponseEntity<?> registerUser( @RequestBody SingUp signUp) {
        try {
            return ResponseEntity.ok(userService.registerUser(signUp));
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).
                    body(exception.getMessage());
        }
    }

    @PostMapping("/saveTicket")
    public Ticket saveTicket( @RequestBody Ticket ticket){
        try {
            return restTemplate.postForObject("http://ticket_service/api/v1/ticket/saveTicket",ticket, Ticket.class);
        }catch (Exception exception) {
            return null;
        }
    }
}
