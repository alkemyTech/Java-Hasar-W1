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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fixed_term_deposit", schema = "JAVHASW1")
public class FixedTermDeposit {

    @Id
    @Column(name = "ID_FIXED_TERM_DEPOSIT", nullable = false)
    @GeneratedValue
    private String fixedTermDepositId;

    @JoinColumn(name = "ID_ACCOUNT")
    @ManyToOne()
    private AccountEntity accountId;

    @Column(name = "AMOUNT", nullable = false)
    private double amount;
    @Column(name = "INTEREST", nullable = false)
    private double interest;
    @Column(name = "CREATION_DATE", updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp creationDate;
    @Column(name = "CLOSING_DATE", updatable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp closingDate;

}
