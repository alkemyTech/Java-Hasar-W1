package com.alkemy.wallet.entity.accountInterface;

import com.alkemy.wallet.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {

}
