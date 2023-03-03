package com.alkemy.wallet.mapping;

import com.alkemy.wallet.dto.UserDto;
import com.alkemy.wallet.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapping {
    public UserDto convertUserToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName((user.getLastName()));
        userDto.setEmail(user.getEmail());
        userDto.setCreationDate(user.getCreationDate().toString());
        userDto.setUpdateDate(user.getUpdateDate().toString());
        userDto.setRoleId(user.getRoleId().toString());
        userDto.setSoftDelete(user.isSoftDelete());
        return userDto;
    }
}
