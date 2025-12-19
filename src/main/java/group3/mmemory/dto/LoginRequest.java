package group3.mmemory.dto;


import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
