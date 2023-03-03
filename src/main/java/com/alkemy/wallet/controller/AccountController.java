package com.alkemy.wallet.controller;

import com.alkemy.wallet.dto.AccountDto;
import com.alkemy.wallet.entity.Account;
import com.alkemy.wallet.service.AccountService;
import com.alkemy.wallet.entity.User;
import com.alkemy.wallet.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;
    private ModelMapper modelMapper;

    @GetMapping("/{userId}")
    public List<AccountDto> findById(@PathVariable String userId) {
        try {
            List<Account> accountList = accountService.findById(userId);
            return accountList.stream().map(account -> convertToDTO(account)).collect(Collectors.toList());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Ocurrio un error", e);
        }
    }
    public AccountDto convertToDTO(Account account) {
        AccountDto accountDTO = modelMapper.map(account, AccountDto.class);
        return accountDTO;
    }

}

