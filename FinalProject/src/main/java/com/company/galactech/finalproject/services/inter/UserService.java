package com.company.galactech.finalproject.services.inter;

import com.company.galactech.finalproject.model.User;



public interface UserService {
    User findByUserId(Integer id);
    User registerUser(User user,Integer id);
}
