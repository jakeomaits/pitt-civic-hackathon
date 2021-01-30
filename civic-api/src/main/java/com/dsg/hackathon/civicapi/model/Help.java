package com.dsg.hackathon.civicapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

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

    @Column(name = "TIME_OF_DAY", updatable = false, nullable = false)
    private String timeOfDay;

    @Column(name = "CREATE_DATE", updatable = false, nullable = false)
    @CreationTimestamp
    private Date createDate;

    @Transient
    private Integer daysRemaining;


    @PostLoad
    private void postLoad()
    {
        LocalDate dateBefore = LocalDate.parse(requestedDate);
        //daysRemaining = (int)DAYS.between(dateBefore, LocalDate.now());
       // daysRemaining = dateBefore.compareTo(LocalDate.now());
        daysRemaining =  (int)Duration.between(dateBefore.atStartOfDay(), LocalDate.now().atStartOfDay()).toDays() *-1;

        //if (!dateBefore.compareTo(LocalDate.now()))
        //{
        //    daysRemaining = daysRemaining*-1;
        //}
    }

}
