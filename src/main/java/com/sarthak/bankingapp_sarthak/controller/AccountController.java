package com.sarthak.bankingapp_sarthak.controller;

import com.sarthak.bankingapp_sarthak.AccountDto.AccountDto;
import com.sarthak.bankingapp_sarthak.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;




@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService){
        this.accountService=accountService;
    }

    //create account rest api
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    //rest api for account view
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable long id){
        AccountDto accountDto=accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }

    //rest api for deposit of money
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable long id,@RequestBody Map<String, Double> request){
        double amount= request.get("amount");
        AccountDto accountDto=accountService.deposit(id, request.get("amount"));
        return ResponseEntity.ok(accountDto);
    }

    //rest api for withdrawal
    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable long id,@RequestBody Map<String,Double> req){
        double amount=req.get("amount");
        AccountDto accountDto=accountService.withdraw(id, req.get("amount"));
        return ResponseEntity.ok(accountDto);
    }

    //get all accounts rest api
    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts(){
        List<AccountDto> accounts=accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }
}
