package dto;

import com.alkemy.wallet.entity.Transactions;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
public class TransactionsDto {
    private double amount;
    private String type;
    private String description;
    private String accountId;
    private String transactionDate;
}