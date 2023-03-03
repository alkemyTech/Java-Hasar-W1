package com.alkemy.wallet.repository;

import com.alkemy.wallet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
    //List<User> findByUserId(String userId);
}
