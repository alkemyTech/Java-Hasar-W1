package com.alkemy.wallet.service;

import com.alkemy.wallet.controller.AccountController;
import com.alkemy.wallet.dto.AccountDto;
import com.alkemy.wallet.entity.Account;
import com.alkemy.wallet.repository.AccountRepository;;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service("accountService")
public abstract class AccountService implements AccountRepository {
    @Autowired
    private final AccountRepository accountRepository;
    private ModelMapper modelMapper;
    @Override
    public List<Account> findById(String userId) {
        return accountRepository.findById(userId);
    }
}

