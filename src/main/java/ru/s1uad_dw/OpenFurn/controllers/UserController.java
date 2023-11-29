package ru.s1uad_dw.OpenFurn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.s1uad_dw.OpenFurn.models.User;
import ru.s1uad_dw.OpenFurn.services.UserService;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class UserController {
    private final UserService service;
//CREATE
    @PostMapping
    public User saveUser(@RequestBody User user){return service.saveUser(user);}
//READ
    @GetMapping
    public List<User> findAllUsers(){
        return service.findAllUsers();
    }
    @GetMapping("{id}")
    public User findById(@PathVariable Long id){return service.findById(id);}
//UPDATE
    @PutMapping
    public User updateUser(@RequestBody User user){return service.updateUser(user);}
//DELETE
    @DeleteMapping("{id}")
    public void deleteUById(@PathVariable Long id){service.deleteById(id);}
}
