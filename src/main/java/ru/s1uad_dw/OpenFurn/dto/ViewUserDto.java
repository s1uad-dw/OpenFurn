package ru.s1uad_dw.OpenFurn.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class ViewUserDto {
    private float balance;
    private byte[] profileImage= new byte[]{};
    private LocalDate dateOfBirth;
    private String username;
    private String email;
}
