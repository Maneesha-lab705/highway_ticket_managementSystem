package lk.ijse.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket {
    private String ticket_Id;
    private String vehicle_number;
    private String diver_name;
    private String direction;
    private Double amount;
    private String status;

}
