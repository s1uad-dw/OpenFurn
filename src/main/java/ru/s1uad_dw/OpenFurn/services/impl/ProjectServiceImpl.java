package ru.s1uad_dw.OpenFurn.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.s1uad_dw.OpenFurn.models.Project;
import ru.s1uad_dw.OpenFurn.repositories.ProjectRepository;
import ru.s1uad_dw.OpenFurn.services.ProjectService;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository repository;

    @Override
    public Project saveProject(Project project) {
        return repository.save(project);
    }

    @Override
    public List<Project> findAllProjects() {
        return repository.findAll();
    }

    @Override
    public Project findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Project updateProject(Project project) {
        return repository.save(project);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
