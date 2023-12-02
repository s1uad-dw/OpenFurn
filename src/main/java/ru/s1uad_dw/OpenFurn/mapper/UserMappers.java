package ru.s1uad_dw.OpenFurn.mapper;

import ru.s1uad_dw.OpenFurn.dao.User;
import ru.s1uad_dw.OpenFurn.dto.CreateUserDto;
import ru.s1uad_dw.OpenFurn.dto.UpdateUserDto;
import ru.s1uad_dw.OpenFurn.dto.ViewUserDto;
import ru.s1uad_dw.OpenFurn.dto.ViewUserListDto;

public class UserMappers {
    public static User createDtoToDao(CreateUserDto dto) {
        return new User(
                dto.getDateOfBirth(),
                dto.getUsername(),
                dto.getEmail()
        );
    }

    public static ViewUserDto daoToViewDto(User dao) {
        return new ViewUserDto(
                dao.getBalance(),
                dao.getProfileImage(),
                dao.getDateOfBirth(),
                dao.getUsername(),
                dao.getEmail()
        );

    }

    public static ViewUserListDto daoToViewListDto(User dao) {
        return new ViewUserListDto(
                dao.getId(),
                dao.getBalance(),
                dao.getDateOfBirth(),
                dao.getUsername(),
                dao.getEmail()
        );

    }

    public static User updateDtoToDao(UpdateUserDto dto) {
        return new User(
                dto.getId(),
                dto.getBalance(),
                dto.getProfileImage(),
                dto.getDateOfBirth(),
                dto.getUsername(),
                dto.getEmail()
        );
    }
}
