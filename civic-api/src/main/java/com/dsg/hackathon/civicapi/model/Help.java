package com.dsg.hackathon.civicapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.net.URI;
import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "HELP")
@Data
public class Help {
    @Id
    @Column(name = "HELP_ID", updatable = false, nullable = false)
    private String helpId;

    @Column(name = "TITLE", updatable = true, nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", updatable = true, nullable = false)
    private String description;

    @Column(name = "USER_ID", updatable = false, nullable = false)
    private String userId;

    @Column(name = "ZIP", updatable = false, nullable = false)
    private String zip;

    @Column(name = "REQUESTED_DATE", updatable = false, nullable = false)
    private String requestedDate;

    @Column(name = "HELP_TYPE", updatable = false, nullable = false)
    private String helpType;

    @Column(name = "IMAGE_URL", updatable = false, nullable = false, length = 2048)
    private String imageUrl;

    @Column(name = "CREATE_DATE", updatable = false, nullable = false)
    @CreationTimestamp
    private Date createDate;
}
