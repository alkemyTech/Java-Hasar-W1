package com.alkemy.wallet.mapping;

import com.alkemy.wallet.entity.Transactions;
import dto.TransactionsDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionsMapping {
//    public Transactions transactionsDto2Entity(TransactionsDto dto) {
//        Transactions transactionsEntity = new Transactions();
//        transactionsEntity.setTransactionDate(dto.getTransactionDate());
//        transactionsEntity.setType(dto.getType());
//        transactionsEntity.setAmount(dto.getAmount());
//        transactionsEntity.setAccountId(dto.getAccountId());
//        transactionsEntity.setDescription(dto.getDescription());
//        return transactionsEntity;
//    }

    public TransactionsDto transactionsEntity2Dto(Transactions entity){
        TransactionsDto dto = new TransactionsDto();
        dto.setAccountId(entity.getAccountId().toString());
        dto.setTransactionDate(entity.getTransactionDate().toString());
        dto.setAmount(entity.getAmount());
        dto.setDescription(entity.getDescription());
//        dto.setType(entity.getType());
        return  dto;
    }

    public List<TransactionsDto> transactionsEntityList2DtoList(List<Transactions> entities) {
        List<TransactionsDto> dtos = new ArrayList<>();
        for (Transactions entity : entities) {
            dtos.add(this.transactionsEntity2Dto(entity));
        }
        return dtos;
    }
}
