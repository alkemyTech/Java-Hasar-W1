package com.alkemy.wallet.controller;

import com.alkemy.wallet.dto.UserDto;
import com.alkemy.wallet.entity.User;
import com.alkemy.wallet.mapping.UserMapping;
import com.alkemy.wallet.repository.UserRepository;
import com.alkemy.wallet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapping userMapping;


  /* @Autowired
    private final String passwordEncoder;*/

    @GetMapping("/{roleId}")
    public List<UserDto> listAllUsers(){
        List<UserDto> userDtoList = new ArrayList<>();
        List<User> userList = userService.findAll();
        for (User user : userList) {
            userDtoList.add(userMapping.convertUserToDto(user));
        }
        return userDtoList;
    }

    @PostMapping
    public UserDto saveUserDto(@RequestBody UserDto userDto){
        UserDto userDtoResponse = userService.register(userDto);
        return userDtoResponse;
    }
}
