package com.alkemy.wallet.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class UserDto implements Serializable {

  //  @NotBlank(message = "First name is required")
    private String firstName;

  //  @NotBlank(mmesage = "Apellido requerido")
    private String lastName;

   // @NotBlank(message = "Email requerido")
   // @Email(message = "Direccion de correo invalida")
    private String email;

  //  @NotBlank(message = "Contraseña requerida")
  //  @Size(min = 8, message = "La contraseña debe contener al menos 8 caracteres")
    private String password;
    private String creationDate;
    private String updateDate;
    private String roleId;
    private boolean softDelete;

    /*public class UserDto {

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    // getters and setters
}
*/
}
