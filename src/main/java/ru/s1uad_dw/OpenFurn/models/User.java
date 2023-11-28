package ru.s1uad_dw.OpenFurn.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private float balance;
    private byte[] profileImage;
    private LocalDate dateOfBirth;

    @Column(unique = true)
    private String email;

    @Transient
    private int age;

    public int getAge(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
