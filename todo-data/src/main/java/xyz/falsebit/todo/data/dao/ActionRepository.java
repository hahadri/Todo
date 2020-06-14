package xyz.falsebit.todo.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.falsebit.todo.data.domain.Action;

@Repository
public interface ActionRepository extends CrudRepository<Action, Long> {

}
