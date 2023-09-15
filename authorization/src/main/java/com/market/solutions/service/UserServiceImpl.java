package com.market.solutions.service;

import com.market.solutions.dto.UserDto;
import com.market.solutions.mapper.UserMapper;
import com.market.solutions.storage.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public UserDto create(UserDto dto) {
        return UserMapper.toDto(repository.save(UserMapper.toUser(dto)));
    }

    @Override
    public UserDto update(UserDto dto) {
        return null;
    }
}
