package com.chethanawijesinghe.client.Entity;

import com.chethanawijesinghe.client.Enum.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private String email;

    private String password;

    private  String name;

    private UserRole role;


    @Lob
    @Column(columnDefinition = "longblob")
    private  byte[] img;

}
