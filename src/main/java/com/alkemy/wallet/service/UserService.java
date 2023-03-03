package com.alkemy.wallet.service;

import com.alkemy.wallet.dto.UserDto;
import com.alkemy.wallet.entity.User;
import com.alkemy.wallet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service("userService")
public abstract class UserService implements UserRepository {
    @Autowired
    private final UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public UserDto register(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword("passwordEncoder");

         userRepository.save(user);
         return userDto;
    }
}
