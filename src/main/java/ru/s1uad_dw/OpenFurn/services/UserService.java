package ru.s1uad_dw.OpenFurn.services;

import org.springframework.web.bind.annotation.*;
import ru.s1uad_dw.OpenFurn.models.User;

import java.util.List;

public interface UserService {
    public User saveUser(@RequestBody User user);
    public List<User> findAllUsers();
    public User findById(@PathVariable Long id);
    public User updateUser(@RequestBody User user);
    public void deleteById(@RequestBody Long id);
}
