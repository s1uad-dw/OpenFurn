package ru.s1uad_dw.OpenFurn.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.s1uad_dw.OpenFurn.dao.Project;
import ru.s1uad_dw.OpenFurn.repositories.ProjectRepository;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProjectService {
    private final ProjectRepository repository;

    public Project saveProject(Project project) {
        return repository.save(project);
    }

    public List<Project> findAllProjects() {
        return repository.findAll();
    }

    public Project findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public Project updateProject(Project project) {
        return repository.save(project);
    }

    @Transactional
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
