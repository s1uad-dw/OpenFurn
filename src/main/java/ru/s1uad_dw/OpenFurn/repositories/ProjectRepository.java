package ru.s1uad_dw.OpenFurn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.s1uad_dw.OpenFurn.dao.Project;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
    void deleteById(UUID id);
}

