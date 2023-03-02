package com.alkemy.wallet.controller;

import com.alkemy.wallet.entity.Account;
import com.alkemy.wallet.entity.User;
import com.alkemy.wallet.repository.AccountRepository;
import com.alkemy.wallet.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserController {
    @RestController
    @RequestMapping("/users/{userId}/accounts")
    public class UserAccountController {
        @Autowired
        private UserAccountRepository userAccountRepository;

        @Autowired
        private AccountRepository accountRepository;

        @GetMapping
        public List<Account> getUserAccounts(@PathVariable UUID userId) {
            List<Account> accounts = new ArrayList<>();
            List<User> userAccounts = userAccountRepository.findByUserId(userId);
            for (User userAccount : userAccounts) {
                accounts.add(accountRepository.findById(userAccount.getIdUser()).orElse(null));
            }
            return accounts;
        }
    }

}
