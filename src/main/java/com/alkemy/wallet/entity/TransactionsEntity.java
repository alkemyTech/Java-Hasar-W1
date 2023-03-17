package com.alkemy.wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
public class TransactionsEntity {
    @Id
    @GeneratedValue
    @Column(name = "ID_TRANSACTION")
    private String idTransaction;
    @JoinColumn(name = "ID_ACCOUNT")
    @ManyToOne()
    private AccountEntity accountId;
    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "TYPE")
    @Enumerated(value = EnumType.STRING)
    private Type type;
    private enum Type{
        INCOME,
        PAYMENT,
        DEPOSIT;
    }
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TRANSACTION_DATE")
    private Timestamp transactionDate;



    //    COMO desarrollador
//    QUIERO agregar la entidad Transaction
//        PARA representar en la implementación la estructura de datos
//
//        Criterios de aceptación:
//        Nombre de tabla: transactions. hecho
//        Los campos son:
//
//        amount: DOUBLE NOT NULL
//
//        type: VARCHAR NOT NULL
//
//        description: VARCHAR NULLABLE
//
//        accountId: Clave foranea hacia ID de Account
//
//        timestamp (transactionDate)
//
//        Ideal que el campo type sea un Enum donde estén definidos los tipos de transacciones,
//        que serán income, payment, deposit
}
