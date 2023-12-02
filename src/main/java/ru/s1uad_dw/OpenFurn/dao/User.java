package ru.s1uad_dw.OpenFurn.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private float balance;
    private byte[] profileImage;

    @Column(nullable = false)
    private LocalDate dateOfBirth;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(unique = true, nullable = false)
    private String email;

    @Transient
    private int age;

    public User(LocalDate dateOfBirth, String username, String email) {
        this.balance = 0;
        this.profileImage = new byte[]{};
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.email = email;
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    public User(UUID id, float balance, byte[] profileImage, LocalDate dateOfBirth, String username, String email) {
        this.id = id;
        this.balance = balance;
        this.profileImage = profileImage;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.email = email;
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
