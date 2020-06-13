package xyz.falsebit.todo.data.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Action extends AbstractEntity<String> {

	private String description;

	@Enumerated(EnumType.STRING)
	private ActionStatus actionStatus;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
