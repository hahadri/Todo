package xyz.falsebit.todo.data.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User extends AbstractEntity<String> {

	private String firstName;
	private String lastName;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Action> actionsTodo = new ArrayList<>();

}
