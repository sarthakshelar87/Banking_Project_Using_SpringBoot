package com.sarthak.bankingapp_sarthak.service.impl;
import com.sarthak.bankingapp_sarthak.AccountDto.AccountDto;
import com.sarthak.bankingapp_sarthak.entity.Account;
import com.sarthak.bankingapp_sarthak.mapper.AccountMapper;
import com.sarthak.bankingapp_sarthak.repository.AccountRepository;
import com.sarthak.bankingapp_sarthak.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class accountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public accountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account= AccountMapper.maptoAccount(accountDto);
        Account savedAccount= accountRepository.save(account);
        return AccountMapper.maptoAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(long id) {
        Account account= accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account Not Found"));
        return AccountMapper.maptoAccountDto(account);
    }

    @Override
    public AccountDto deposit(long id, double amount) {
        Account account= accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account Not Found"));
        double total=account.getBalance()+amount;
        account.setBalance(total);
        Account savedAccount=accountRepository.save(account);
        return AccountMapper.maptoAccountDto(savedAccount);
    }

    @Override
    public AccountDto withdraw(long id, double amount) {
        Account account= accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account Not Found"));
        if(account.getBalance()<amount){
            throw new RuntimeException("Insufficient Funds in the Account");
        }
        double remaining=account.getBalance()-amount;
        account.setBalance(remaining);
        Account updatedAccount=accountRepository.save(account);
        return AccountMapper.maptoAccountDto(updatedAccount);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts=accountRepository.findAll();
        return accounts.stream().map((account)->AccountMapper.maptoAccountDto(account)).collect(Collectors.toList());

    }


}
