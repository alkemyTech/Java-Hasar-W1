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
public class Transactions {
    @Id
    @GeneratedValue
    
    @Column(name = "ID_TRANSACTION")
    private UUID idTransaction;
    @JoinColumn(name = "ID_ACCOUNT")
    @ManyToOne()
    private Account accountId;
    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "TYPE")
    private Type type;
    private enum Type{
        INCOME,
        PAYMENT,
        DEPOSIT;
    }
    @Column(name = "DESCRIPTION")
    private String description;

   /* @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "Account")
    @JoinColumn(name = "accountId", referencedColumnName = "ID_ACCOUNT")
    @Column(name = "ID_ACCOUNT")
    private Account accountId;*/
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
