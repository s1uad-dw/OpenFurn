package ru.s1uad_dw.OpenFurn.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    private String text;
}
