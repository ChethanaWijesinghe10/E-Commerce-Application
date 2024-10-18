package com.chethanawijesinghe.client.Services.Auth;

import com.chethanawijesinghe.client.DTO.SignupRequest;
import com.chethanawijesinghe.client.DTO.UserDTO;
import com.chethanawijesinghe.client.Entity.User;
import com.chethanawijesinghe.client.Enum.UserRole;
import com.chethanawijesinghe.client.Repository.UserRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

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


    @PostConstruct
    public void createAdminAccount(){
        User adminAccount =userRepo.findByRole(UserRole.ADMIN);
        if(null==adminAccount){
            User user =new User();
            user.setEmail("admin.com");
            user.setName("admin");
            user.setRole(UserRole.ADMIN);
            user.setPassword(new BCryptPasswordEncoder().encode("admin"));
            userRepo.save(user);
        }
    }
}
