package lk.ijse.user_service.dto;


import lk.ijse.user_service.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SingUp {
  //  @Null(message = "Id generate by  program")
    private String id;
   // @NotNull(message = "Name cannot be null")
    private String name;
   // @NotNull(message = "Email cannot be null")
   // @Email
    private String email;
   // @NotNull(message = "Password cannot be null")
    private String password;
   // @NotNull(message = "Role cannot be null")
    private Role role;
}
