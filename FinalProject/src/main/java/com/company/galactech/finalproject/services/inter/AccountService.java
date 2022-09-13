package com.company.galactech.finalproject.services.inter;

import com.company.galactech.finalproject.exceptions.AccountBalanceException;
import com.company.galactech.finalproject.model.Account;

public interface AccountService {
    Double getUserAccountBalance(Integer userId) throws AccountBalanceException;
    Double increaseBalance(Double balance,Integer userId) throws AccountBalanceException;
    Double doVIP(Integer id) throws AccountBalanceException;
    Account deleteAccount(Integer id) throws AccountBalanceException;
}
