package service.impl;

import com.alkemy.wallet.entity.Transactions;
import com.alkemy.wallet.mapping.TransactionsMapping;
import com.alkemy.wallet.repository.TransactionsRepository;
import dto.TransactionsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TransactionsService;

import java.util.List;

@Service("transactionsService")

public class TransactionsServiceImpl implements TransactionsService {

    @Autowired
    private TransactionsMapping transactionsMapping;
    @Autowired
    private TransactionsRepository transactionsRepository;
    public TransactionsDto save(TransactionsDto dto) {
        Transactions entity = transactionsMapping.transactionsDto2Entity(dto);
        TransactionsRepository transactionSaved = transactionsRepository.save(entity);
        TransactionsDto result = transactionsMapping.transactionsEntity2Dto(transactionSaved);
        return result;
    }

    public List<TransactionsDto> getAllTransactions() {
        List<Transactions> entities = this.transactionsRepository.findAll();
        List<TransactionsDto> result = transactionsMapping.transactionsEntityList2DtoList(entities);
        return result;
    }


    public void registerOperation(double amount) {
        Transactions transaction = new Transactions();
        transaction.setType("deposit");
        transaction.setAmount(amount);
        transactionsRepository.save(transaction);
    }
}
