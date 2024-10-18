package com.chethanawijesinghe.client.DTO;

import com.chethanawijesinghe.client.Enum.UserRole;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String email;
    private String  name;

    private UserRole userRole;
}
