package com.alkemy.wallet.service;

import com.alkemy.wallet.dto.UserDto;
import com.alkemy.wallet.mapper.UserMapper;
import com.alkemy.wallet.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserMapper userMapper;
    private UserRepository userRepository;

    public List<UserDto> getAllUsers() {
        return userMapper.convertUserEntityListToUserDtoList(userRepository.findAll());
    }
}
