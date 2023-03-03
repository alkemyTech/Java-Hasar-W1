package com.alkemy.wallet.service;

import com.alkemy.wallet.entity.Account;
import com.alkemy.wallet.repository.AccountRepository;;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service("accountService")
public class AccountService{

    /*@Autowired
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }*/
    @Autowired(required = true)
    private final AccountRepository accountRepository;
    public List<Account> findById(String userId) {
        return accountRepository.findById(userId);
    }
}

