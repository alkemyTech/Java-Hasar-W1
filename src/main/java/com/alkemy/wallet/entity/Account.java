package com.alkemy.wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "accounts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @Column(name = "ID_ACCOUNT")
    private UUID idAccount;

    @Column(name="CURRENCY", nullable = false, length = 80 )@Enumerated(value = EnumType.STRING)private Account currency;
    private enum currency{
        ARS,
        USD;
    }

    @Column(name = "TRANSACTION_LIMIT", nullable = false )
    private double transactionLimit;

    @Column(name = "BALANCE", nullable = false)
    private double balance;

    @Column(name = "CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp creationDate;
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp updateDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_USER")
    private User user;


}
/*
userId: Clave foranea hacia ID de User

softDelete
 */