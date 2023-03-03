package com.alkemy.wallet.dto;

import com.alkemy.wallet.entity.Account;
import lombok.Data;

import javax.persistence.Enumerated;
import java.io.Serializable;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AccountDto implements Serializable {

    private String currency;
    private double transactionLimit;
    private double balance;
    private String creationDate;
    private String updateDate;
    private boolean softDelete = Boolean.FALSE;

}
