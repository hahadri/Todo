package xyz.falsebit.todo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xyz.falsebit.todo.service.UserService;
import xyz.falsebit.todo.service.dto.UserDto;
import xyz.falsebit.todo.service.mapper.UserMapper;

@RestController
@RequestMapping("/todo")
public class TodoRestController {

    @Autowired
    private final UserService userService = null;

    @Autowired
    private final UserMapper userMapper = null;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody UserDto userDto) {
        return this.userService.createUser(userDto);
    }
}
