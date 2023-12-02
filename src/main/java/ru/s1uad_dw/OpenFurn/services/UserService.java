package ru.s1uad_dw.OpenFurn.services;

import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.s1uad_dw.OpenFurn.dto.CreateUserDto;
import ru.s1uad_dw.OpenFurn.dto.UpdateUserDto;
import ru.s1uad_dw.OpenFurn.dto.ViewUserDto;
import ru.s1uad_dw.OpenFurn.dto.ViewUserListDto;
import ru.s1uad_dw.OpenFurn.mapper.UserMappers;
import ru.s1uad_dw.OpenFurn.repositories.*;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;
    public UUID saveUser(CreateUserDto user) {
        return repository.save(UserMappers.createDtoToDao(user)).getId();
    }

    public List<ViewUserListDto> findAllUsers() {
        return repository.findAll().stream().map(UserMappers::daoToViewListDto).toList();
    }

    public ViewUserDto findById(UUID id) throws ChangeSetPersister.NotFoundException {
        var userDao = repository.findById(id);
        if (userDao.isPresent())
            return UserMappers.daoToViewDto(userDao.get());
        throw new ChangeSetPersister.NotFoundException();
    }

    public UUID updateUser(UpdateUserDto user) {
        return repository.save(UserMappers.updateDtoToDao(user)).getId();
    }

    @Transactional
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
