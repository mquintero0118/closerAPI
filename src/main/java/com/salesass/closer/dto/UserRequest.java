package com.salesass.closer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "El campo nombre es necesario")
    @NotBlank(message = "El campo nombre es necesario")
    private String first_name;
    private String second_name;
    @NotNull(message = "El campo apellido es necesario")
    @NotBlank(message = "El campo apellido es necesario")
    private String last_name;
    private String second_last_name;
    @Email(message = "El email no es valido")
    @NotBlank(message = "El email no es valido")
    private String email;
    @NotNull(message = "El password es necesario")
    @NotBlank(message = "El password es necesario")
    private String password;
    private LocalDateTime created;
    private LocalDateTime updated;
}
