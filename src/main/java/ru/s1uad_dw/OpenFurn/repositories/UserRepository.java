package ru.s1uad_dw.OpenFurn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import ru.s1uad_dw.OpenFurn.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteById(Long id);
}
