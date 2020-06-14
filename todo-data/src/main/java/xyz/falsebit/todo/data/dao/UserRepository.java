package xyz.falsebit.todo.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.falsebit.todo.data.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByFirstNameAndLastName(String firstName, String lastName);

}
