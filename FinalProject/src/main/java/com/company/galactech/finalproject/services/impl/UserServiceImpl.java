package com.company.galactech.finalproject.services.impl;

import com.company.galactech.finalproject.model.City;
import com.company.galactech.finalproject.model.User;
import com.company.galactech.finalproject.repositories.UserRepository;
import com.company.galactech.finalproject.services.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;



    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUserId(Integer id) {
        return userRepository.findByUserId(id);
    }

    @Override
    public User registerUser(User user, Integer id) {
        user.setCity(new City(id));
        return userRepository.save(user);
    }
}
