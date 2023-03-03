package com.alkemy.wallet.controller;

import dto.TransactionsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TransactionsService;

import java.util.List;

@RestController
@RequestMapping("transactions")

public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;

    @GetMapping
    public ResponseEntity<List<TransactionsDto>> getAll() {
        List<TransactionsDto> transactions = transactionsService.getAllTransactions();
        return ResponseEntity.ok().body(transactions);
    }
    @PostMapping("/{deposit}")
    public ResponseEntity<TransactionsDto> save(@RequestBody TransactionsDto transaction) {
        if (transaction.getAmount()>0) {
            TransactionsDto transactionSaved = transactionsService.save(transaction);
            return ResponseEntity.status(HttpStatus.CREATED).body(transactionSaved);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(transaction);
    }

}
