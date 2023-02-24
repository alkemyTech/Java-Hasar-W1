package com.alkemy.wallet.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "fixed_term_deposits")
@Getter
@Setter
public class FixedTermDeposit {
    @Id
    @Column(name = "ID_FIXED_TERM_DEPOSITS")
    private UUID idFixedTermDeposits;
    @Column(name = "AMOUNT", nullable = false)
    private double amount;
    @Column(name = "INTEREST", nullable = false)
    private double interest;
    @Column(name = "CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalTime creationDate;
    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalTime updateDate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "ACCOUNT_ID", insertable = false, updatable = false)
    private Account account;

    @Column(name = "ACCOUNT_ID")
    private UUID accountId;

    public FixedTermDeposit() {
    }

    public FixedTermDeposit(UUID idFixedTermDeposits, double amount, double interest, LocalTime creationDate, LocalTime updateDate, Account account, UUID accountId) {
        this.idFixedTermDeposits = idFixedTermDeposits;
        this.amount = amount;
        this.interest = interest;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.account = account;
        this.accountId = accountId;
    }
}


