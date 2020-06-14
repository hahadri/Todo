package xyz.falsebit.todo.service;

import xyz.falsebit.todo.service.dto.UserDto;

public interface UserService {

    public UserDto createUser(UserDto userDto);

    public UserDto updateUserEmail(UserDto userDto);

    public void deleteUserByFullName(UserDto userDto);
}
