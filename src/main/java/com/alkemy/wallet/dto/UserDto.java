package com.alkemy.wallet.dto;

import com.alkemy.wallet.entity.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String idUser;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private RoleEntity roleId;
    private Timestamp creationDate;
    private Timestamp updateDate;
    private boolean softDelete;
}
