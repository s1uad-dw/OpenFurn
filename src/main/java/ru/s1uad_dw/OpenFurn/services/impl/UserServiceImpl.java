package ru.s1uad_dw.OpenFurn.services.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import ru.s1uad_dw.OpenFurn.models.User;
import ru.s1uad_dw.OpenFurn.services.UserService;
import ru.s1uad_dw.OpenFurn.repositories.*;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(@RequestBody Long id) {repository.deleteById(id);}
}
