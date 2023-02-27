package com.alkemy.wallet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "fixed_term_deposit", schema = "JAVHASW1")
public class FixedTermDeposit {

    @Id
    @Column(name = "ID_FIXED_TERM_DEPOSIT", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "Account")
    @JoinColumn(name = "accountId", referencedColumnName = "IdAccount")
    private UUID accountId;

    @Column(name = "AMOUNT", nullable = false)
    private double amount;
    @Column(name = "INTEREST", nullable = false)
    private double interest;
    @Column(name = "CREATION_DATE", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp creationDate;
    @Column(name = "CLOSING_DATE", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp closingDate;

    public FixedTermDeposit(double amount, UUID accountId, double interest, Timestamp creationDate, Timestamp closingDate){
        this.accountId = accountId;
        this.amount = amount;
        this.interest = interest;
        this.creationDate = creationDate;
        this.closingDate = closingDate;
    }
}
