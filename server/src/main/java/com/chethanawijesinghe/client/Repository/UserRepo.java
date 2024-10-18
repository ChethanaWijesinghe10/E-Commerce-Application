package com.chethanawijesinghe.client.Repository;

import com.chethanawijesinghe.client.Entity.User;
import com.chethanawijesinghe.client.Enum.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findFirstByEmail(String email);

    User findByRole(UserRole userRole);
}
