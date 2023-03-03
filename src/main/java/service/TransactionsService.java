package service;

import dto.TransactionsDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TransactionsService {
    TransactionsDto save(TransactionsDto dto);
    List<TransactionsDto> getAllTransactions();
    public void registerOperation(double);
}
