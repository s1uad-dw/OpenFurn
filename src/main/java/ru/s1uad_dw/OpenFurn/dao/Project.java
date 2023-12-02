package ru.s1uad_dw.OpenFurn.dao;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User creator;

    private int purchased;
    private int viewed;
    private int price;
    private String filePath;
}
