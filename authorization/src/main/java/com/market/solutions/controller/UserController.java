package com.market.solutions.controller;

import com.market.solutions.dto.UserDto;
import com.market.solutions.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {

    private final UserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UserDto create(@Valid @RequestBody UserDto dto) {
        log.info("Получен запрос POST /users c именем {} и адресом почты {}", dto.getName(), dto.getEmail());
        return service.create(dto);
    }

    @PatchMapping("/{userId}")
    UserDto update(@RequestBody UserDto dto, @PathVariable Long userId) {
        log.info("Получен запрос PATCH /users с id", userId);
        return service.update(dto);
    }
}
