package com.company.galactech.finalproject.controllers;

import com.company.galactech.finalproject.dto.UserDTO;
import com.company.galactech.finalproject.model.User;
import com.company.galactech.finalproject.services.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
       User user = userService.findByUserId(id);
       UserDTO userDTO = new UserDTO(user);
       return ResponseEntity.ok(userDTO);
    }

    @PostMapping("/register/{id}")
    public User userRegister(@RequestBody User user, @PathVariable Integer id){
        return userService.registerUser(user,id);
    }
}
