package com.chethanawijesinghe.client.Services.Auth;

import com.chethanawijesinghe.client.DTO.SignupRequest;
import com.chethanawijesinghe.client.DTO.UserDTO;
import com.chethanawijesinghe.client.Entity.User;
import com.chethanawijesinghe.client.Enum.UserRole;
import com.chethanawijesinghe.client.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceIMPL implements AuthService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserDTO createUser(SignupRequest signupRequest) {
        User user = new User();
        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());

        // Use setPassword instead of getPassword
        user.setPassword(bCryptPasswordEncoder.encode(signupRequest.getPassword()));
        user.setRole(UserRole.CUSTOMER);

        // Save the user and return the userDTO
        User createdUser = userRepo.save(user);
        UserDTO userDTO = new UserDTO();
        userDTO.setId(createdUser.getId());

        return userDTO;
    }

    @Override
    public boolean hasUserWithEmail(String email) {
        return userRepo.findFirstByEmail(email).isPresent();
    }
}
