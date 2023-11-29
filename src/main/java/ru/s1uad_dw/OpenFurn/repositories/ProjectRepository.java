package ru.s1uad_dw.OpenFurn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.s1uad_dw.OpenFurn.models.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    void deleteById(Long id);
}

