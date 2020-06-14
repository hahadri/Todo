package xyz.falsebit.todo.service.dto;

import java.io.Serializable;

public class ActionDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private UserDto user;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
