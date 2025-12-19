package group3.mmemory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String message;
    private String token;
    private Integer userId;   // <-- change to Integer
    private String username;
    private String email;
}
