package xyz.falsebit.todo.data.dao;

import org.springframework.data.repository.CrudRepository;

import xyz.falsebit.todo.data.model.User;

public interface UserRepository  extends CrudRepository<User, Long>{

}
