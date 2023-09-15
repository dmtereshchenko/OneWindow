package com.market.solutions.mapper;

import com.market.solutions.dto.UserDto;
import com.market.solutions.model.User;

public class UserMapper {

    public static User toUser(UserDto dto) {
        return new User(
                null,
                dto.getName(),
                dto.getEmail(),
                null
        );
    }

    public static UserDto toDto(User user) {
        return new UserDto(
                user.getName(),
                user.getEmail()
        );
    }
}
