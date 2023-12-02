package ru.s1uad_dw.OpenFurn.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import ru.s1uad_dw.OpenFurn.dao.User;
import ru.s1uad_dw.OpenFurn.dto.CreateUserDto;
import ru.s1uad_dw.OpenFurn.dto.UpdateUserDto;
import ru.s1uad_dw.OpenFurn.dto.ViewUserDto;
import ru.s1uad_dw.OpenFurn.dto.ViewUserListDto;
import ru.s1uad_dw.OpenFurn.services.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class UserController {
    @Autowired
    private final UserService service;

    //CREATE
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UUID saveUser(@RequestBody CreateUserDto user) {
        return service.saveUser(user);
    }

    //READ
    @GetMapping
    public List<ViewUserListDto> findAllUsers() {
        return service.findAllUsers();
    }

    @GetMapping("{id}")
    public ViewUserDto findById(@PathVariable UUID id) throws ChangeSetPersister.NotFoundException {
        return service.findById(id);
    }

    //UPDATE
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UUID updateUser(@RequestBody UpdateUserDto user) {
        return service.updateUser(user);
    }

    //DELETE
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUById(@PathVariable UUID id){
        service.deleteById(id);
    }
}
