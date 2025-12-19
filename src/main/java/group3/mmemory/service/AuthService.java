package group3.mmemory.service;

import group3.mmemory.dto.LoginRequest;
import group3.mmemory.dto.RegisterRequest;
import group3.mmemory.dto.AuthResponse;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}
