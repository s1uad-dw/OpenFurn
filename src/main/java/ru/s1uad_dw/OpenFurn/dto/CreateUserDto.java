package ru.s1uad_dw.OpenFurn.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.s1uad_dw.OpenFurn.dao.User;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
public class CreateUserDto {
    private LocalDate dateOfBirth;
    private String username;
    private String email;
}
