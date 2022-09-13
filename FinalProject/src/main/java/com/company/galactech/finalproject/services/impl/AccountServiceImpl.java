package com.company.galactech.finalproject.services.impl;

import com.company.galactech.finalproject.exceptions.AccountBalanceException;
import com.company.galactech.finalproject.model.Account;
import com.company.galactech.finalproject.model.User;
import com.company.galactech.finalproject.repositories.AccountRepository;
import com.company.galactech.finalproject.repositories.UserRepository;
import com.company.galactech.finalproject.services.inter.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    AccountRepository accountRepository;
    UserRepository userRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
    }


    @Override
    public Double getUserAccountBalance(Integer userId) {
        try {
            User user = userRepository.findByUserId(userId);
            Account account = accountRepository.getUserAccount(user);
            if (user != null && account != null) {
                return account.getBalance();
            } else if (user != null && account == null) {
                Account newAccount = Account.builder().balance(0.0).user(user).vip(false).build();
                accountRepository.save(newAccount);
                return newAccount.getBalance();
            } else {
                throw new AccountBalanceException("Belə bir istifadəçi sistemdə mövcud deyil");
            }
        }catch (AccountBalanceException ex){
            ex.getMessage();
            return null;
        }
    }

    @Override
    public Double increaseBalance(Double balance, Integer userId){
        Double getBalance = getUserAccountBalance(userId);
        User user = userRepository.findByUserId(userId);
        Account account = accountRepository.getUserAccount(user);
        Double newBalance = getBalance + balance;
        account.setBalance(newBalance);
        accountRepository.save(account);
        return account.getBalance();
    }


    //    @Override
    public Double doVIP(Integer id) {
        try {
            Double getBalance = getUserAccountBalance(id);
            User user = userRepository.findByUserId(id);
            Account account = accountRepository.getUserAccount(user);

            if (getBalance >= 15) {
                Double newBalance = getBalance - 15;
                account.setBalance(newBalance);
                account.setVip(true);
                accountRepository.save(account);
                return account.getBalance();
            } else {
                throw new AccountBalanceException("Elanı VIP etmək üçün balansınızda kifayət qədər vəsait yoxdur");
            }
        } catch (AccountBalanceException ex) {
            ex.getMessage();
        }
        return null;
    }

    @Override
    public Account deleteAccount(Integer id) {
        Optional<Account> account = accountRepository.findById(id);
        try {
            if (account.isEmpty()) {
                throw new AccountBalanceException("Belə bir istifadəçi mövcud deyil");
            } else {
                    accountRepository.deleteByUserId(id);
            }
        } catch (AccountBalanceException ex) {
            ex.getMessage();
        }

        return null;
    }
}
