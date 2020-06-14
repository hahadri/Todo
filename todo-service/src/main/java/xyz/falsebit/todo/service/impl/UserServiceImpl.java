package xyz.falsebit.todo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.falsebit.todo.data.dao.UserRepository;
import xyz.falsebit.todo.data.domain.User;
import xyz.falsebit.todo.service.UserService;
import xyz.falsebit.todo.service.dto.UserDto;
import xyz.falsebit.todo.service.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository = null;

    @Autowired
    private final UserMapper userMapper = null;

    @Override
    public UserDto createUser(UserDto userDto) {
        User newUser = userMapper.toUserEntity(userDto);
        this.userRepository.save(newUser);
        return userDto;
    }

    @Override
    public UserDto updateUserEmail(UserDto userDto) {
        User user = userRepository.findByFirstNameAndLastName(userDto.getFirstName(), userDto.getLastName());
        user.setEmail(userDto.getEmail());
        User updatedUser = this.userRepository.save(user);
        return userMapper.toUserDto(updatedUser);
    }

    @Override
    public void deleteUserByFullName(UserDto userDto) {
        User user = userRepository.findByFirstNameAndLastName(userDto.getFirstName(), userDto.getLastName());
        this.userRepository.delete(user);
    }

}
