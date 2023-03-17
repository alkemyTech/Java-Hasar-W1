package com.alkemy.wallet.mapper;

import com.alkemy.wallet.dto.UserDto;
import com.alkemy.wallet.entity.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {
    public UserDto convertUserEntityToUserDto(UserEntity userEntity){
        UserDto userDto = new UserDto();
        userDto.setIdUser(userEntity.getIdUser());
        userDto.setRoleId(userEntity.getRoleId());
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setEmail(userEntity.getEmail());
        userDto.setSoftDelete(userEntity.isSoftDelete());
        userDto.setCreationDate(userEntity.getCreationDate());
        userDto.setUpdateDate(userEntity.getUpdateDate());
        userDto.setPassword(userEntity.getPassword());
        return userDto;
    }

    public UserEntity convertUserDtoToUserEntity(UserDto userDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setIdUser(userDto.getIdUser());
        userEntity.setRoleId(userDto.getRoleId());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setSoftDelete(userDto.isSoftDelete());
        userEntity.setCreationDate(userDto.getCreationDate());
        userEntity.setUpdateDate(userDto.getUpdateDate());
        userEntity.setPassword(userDto.getPassword());
        return userEntity;
    }

    public List<UserDto> convertUserEntityListToUserDtoList(List<UserEntity> userEntityList){
        List<UserDto> userDtosList = userEntityList.stream()
                .map(this::convertUserEntityToUserDto)
                .collect(Collectors.toList());
        return userDtosList;
    }
}
