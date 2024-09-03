package com.sarthak.bankingapp_sarthak.AccountDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {

    private long id;
    private String accountHolderName;
    private double balance;


}
