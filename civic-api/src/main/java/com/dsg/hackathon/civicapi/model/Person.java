package com.dsg.hackathon.civicapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERSON")
@Data
public class Person {
    @Id
    @Column(name = "PERSON_ID", updatable = false, nullable = false)
    private String personId = UUID.randomUUID().toString();

    @Column(name = "FIRST_NAME", updatable = true, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", updatable = true, nullable = false)
    private String lastName;

    @Column(name = "CREATE_DATE", updatable = false, nullable = false)
    @CreationTimestamp
    private Date createDate;
}
