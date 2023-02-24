package com.alkemy.wallet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "accounts")
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
    private LocalTime creationDate;
    @Column(name = "UPDATE_DATE")
    private LocalTime updateDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_USER")
    private User user;


}
/*
userId: Clave foranea hacia ID de User

softDelete
 */