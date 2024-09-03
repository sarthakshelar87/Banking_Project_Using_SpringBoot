package com.sarthak.bankingapp_sarthak.mapper;

import com.sarthak.bankingapp_sarthak.AccountDto.AccountDto;
import com.sarthak.bankingapp_sarthak.entity.Account;

public class AccountMapper {
    public static Account maptoAccount(AccountDto accountDto){
        Account account= new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }
    public static AccountDto maptoAccountDto(Account account){
        AccountDto accountDto=new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
