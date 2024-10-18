package com.chethanawijesinghe.client.Services.Auth;

import com.chethanawijesinghe.client.DTO.SignupRequest;
import com.chethanawijesinghe.client.DTO.UserDTO;

public interface AuthService  {
    UserDTO createUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);

}
