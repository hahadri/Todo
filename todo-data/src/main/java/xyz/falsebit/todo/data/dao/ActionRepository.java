package xyz.falsebit.todo.data.dao;

import org.springframework.data.repository.CrudRepository;

import xyz.falsebit.todo.data.model.Action;

public interface ActionRepository extends CrudRepository<Action, Long> {

}
