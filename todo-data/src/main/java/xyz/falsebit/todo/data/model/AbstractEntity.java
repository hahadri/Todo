package xyz.falsebit.todo.data.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public class AbstractEntity<U> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@CreatedBy
	@Column(name = "created_by")
	private U createdBy;

	@CreatedDate
	@Column(name = "created_date")
	private Date createdDate;

	@LastModifiedBy
	@Column(name = "last_modified_by")
	private U lastModifiedBy;

	@LastModifiedDate
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
}
