package com.alkemy.wallet.entity.interfaceUser;

import com.alkemy.wallet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserAccountRepository extends JpaRepository<User, UUID> {
    List<User> findByUserId(UUID userId);
}
