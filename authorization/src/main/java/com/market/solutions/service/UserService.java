package com.market.solutions.service;

import com.market.solutions.dto.UserDto;

public interface UserService {

    UserDto create(UserDto dto);

    UserDto update(UserDto dto);
}
