package com.company.galactech.finalproject.controllers;


import com.company.galactech.finalproject.exceptions.AccountBalanceException;
import com.company.galactech.finalproject.model.Account;
import com.company.galactech.finalproject.services.inter.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/balance")
public class AccountController {
    AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/getUserBalance")
    public ResponseEntity<Double> getUserAccountBalance(@RequestParam Integer id) throws AccountBalanceException {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(accountService.getUserAccountBalance(id));
    }

    @PostMapping("/increaseBalance")
    ResponseEntity<Double> increaseBalance(@RequestParam Double balance,@RequestParam Integer id) throws AccountBalanceException {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(accountService.increaseBalance(balance, id));
    }
    @PostMapping("/doVIP")
    ResponseEntity<Double> doVIP(@RequestParam Integer id) throws AccountBalanceException {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(accountService.doVIP(id));
    }
    @DeleteMapping("deleteAccount")
    ResponseEntity<Account> deleteAccount(@RequestParam Integer id) throws AccountBalanceException {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(accountService.deleteAccount(id));
    }

}
