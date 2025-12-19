package group3.mmemory.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterResponse {
	private String message;
    private String token;   // JWT token
    private Long userId;    // user's ID
    private String username;
    private String email;
}
