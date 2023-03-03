package com.alkemy.wallet.repository;

import com.alkemy.wallet.dto.AccountDto;
import com.alkemy.wallet.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, String> {
    Optional<Account> findById(String userId);
}
