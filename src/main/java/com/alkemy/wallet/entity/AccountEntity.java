package com.alkemy.wallet.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "accounts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccountEntity {
    @Id
    @GeneratedValue
    @Column(name = "ID_ACCOUNT")
    private String id;

    @Column(name="CURRENCY", nullable = false, length = 40 )
    @Enumerated(value = EnumType.STRING)
    private Currency currency;
    public enum Currency{
        ARS,
        USD;
    }

    @Column(name = "TRANSACTION_LIMIT", nullable = false )
    private double transactionLimit;

    @Column(name = "BALANCE", nullable = false)
    private double balance;

    @Column(name = "CREATION_DATE")
    private Timestamp creationDate;
    @Column(name = "UPDATE_DATE")
    // @Temporal(TemporalType.TIMESTAMP)
    private Timestamp updateDate;

    @Column(name = "SOFT_DELETE")
    private boolean softDelete = Boolean.FALSE;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private UserEntity user;

}

