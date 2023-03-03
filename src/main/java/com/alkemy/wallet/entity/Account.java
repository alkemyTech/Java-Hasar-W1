package com.alkemy.wallet.entity;

import com.alkemy.wallet.dto.AccountDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "accounts")
@SQLDelete(sql = "UPDATE account set deleted = true WHERE id=?")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(generator = "UUID")
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
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

}
