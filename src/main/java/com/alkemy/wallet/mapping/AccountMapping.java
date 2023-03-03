package com.alkemy.wallet.mapping;

import com.alkemy.wallet.dto.AccountDto;
import com.alkemy.wallet.entity.Account;

public class AccountMapping {
    private AccountDto convertEntityToDTO(Account account) {
        AccountDto accountDTO = new AccountDto();
        accountDTO.setBalance(account.getBalance());
        accountDTO.setCurrency(account.getCurrency().toString());
        accountDTO.setCreationDate(account.getCreationDate().toString());
        accountDTO.setUpdateDate(account.getUpdateDate().toString());
        accountDTO.setSoftDelete(account.isSoftDelete());
        return accountDTO;
    }
}
