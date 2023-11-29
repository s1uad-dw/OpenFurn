package ru.s1uad_dw.OpenFurn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.s1uad_dw.OpenFurn.models.Project;
import ru.s1uad_dw.OpenFurn.models.User;
import ru.s1uad_dw.OpenFurn.services.ProjectService;

import java.util.List;

@RestController
@RequestMapping("api/v1/projects")
@AllArgsConstructor
public class ProjectController {
    private final ProjectService service;
    //CREATE
    @PostMapping
    public Project saveUser(@RequestBody Project project){return service.saveProject(project);}
    //READ
    @GetMapping
    public List<Project> findAllProjects(){
        return service.findAllProjects();
    }
    @GetMapping("{id}")
    public Project findById(@PathVariable Long id){return service.findById(id);}
    //UPDATE
    @PutMapping
    public Project updateProject(@RequestBody Project project){return service.updateProject(project);}
    //DELETE
    @DeleteMapping("{id}")
    public void deleteUById(@PathVariable Long id){service.deleteById(id);}
}
