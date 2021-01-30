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
@Table(name = "USER")
@Data
public class User {
    @Id
    @Column(name = "USER_ID", updatable = false, nullable = false)
    private String userId;

    @Column(name = "FIRST_NAME", updatable = true, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", updatable = true, nullable = false)
    private String lastName;

    @Column(name = "EMAIL", updatable = true, nullable = false)
    private String email;

    @Column(name = "ZIP", updatable = true, nullable = false)
    private String zip;

    @Column(name = "ORGANIZATION_ID", updatable = true, nullable = false)
    private String organizationId;

    @Column(name = "PASSWORD", updatable = true, nullable = false)
    private String password;

    @Column(name = "POINTS", updatable = true, nullable = false)
    private Integer points;

    @Column(name = "CREATE_DATE", updatable = false, nullable = false)
    @CreationTimestamp
    private Date createDate;
}
