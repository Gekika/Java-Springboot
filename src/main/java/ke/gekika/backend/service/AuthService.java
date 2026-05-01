package ke.gekika.backend.service;

import jakarta.validation.Valid;
import ke.gekika.backend.dto.request.LoginUserRequest;
import ke.gekika.backend.dto.request.RegisterUserRequest;
import ke.gekika.backend.dto.response.AppUserResponse;
import ke.gekika.backend.dto.response.MessageResponse;

public interface AuthService {
    MessageResponse registerUser( RegisterUserRequest request);

    AppUserResponse loginUser(LoginUserRequest request);
}
