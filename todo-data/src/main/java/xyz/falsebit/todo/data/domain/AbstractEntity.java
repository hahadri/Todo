package xyz.falsebit.todo.data.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class AbstractEntity {

    @CreatedDate
    @Column(name = "created_date")
    private Date createdDate;


    @LastModifiedDate
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;
}
