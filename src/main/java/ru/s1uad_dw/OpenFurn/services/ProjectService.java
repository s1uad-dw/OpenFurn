package ru.s1uad_dw.OpenFurn.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import ru.s1uad_dw.OpenFurn.models.Project;
import ru.s1uad_dw.OpenFurn.models.User;

import java.util.List;

public interface ProjectService {
    public Project saveProject(@RequestBody Project project);
    public List<Project> findAllProjects();
    public Project findById(@PathVariable Long id);
    public Project updateProject(@RequestBody Project project);
    public void deleteById(@RequestBody Long id);
}
