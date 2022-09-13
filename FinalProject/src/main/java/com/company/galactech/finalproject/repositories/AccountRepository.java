package com.company.galactech.finalproject.repositories;

import com.company.galactech.finalproject.model.Account;
import com.company.galactech.finalproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account,Integer> {
      @Query("SELECT a from Account a where a.user = ?1")
      Account getUserAccount(User userId);

      @Query("delete from Account a where a.user = ?1")
      Account deleteByUserId(Integer userId);
}
