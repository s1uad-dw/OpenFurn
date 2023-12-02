package ru.s1uad_dw.OpenFurn.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class ViewUserListDto {
    private UUID id;
    private Float balance;
    private LocalDate dateOfBirth;
    private String username;
    private String email;
}
