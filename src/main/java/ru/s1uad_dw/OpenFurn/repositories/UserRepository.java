package ru.s1uad_dw.OpenFurn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.s1uad_dw.OpenFurn.dao.User;
import ru.s1uad_dw.OpenFurn.dto.ViewUserDto;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    void deleteById(UUID id);

    Optional<User> findById(UUID id);
}
