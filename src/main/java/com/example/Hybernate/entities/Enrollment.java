package com.example.Hybernate.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Enrollments")
public class Enrollment {

    @Id
    private long id;

    @ManyToOne(optional = false)
    private Student studentEnrollment;

    @ManyToOne(optional = false)
    private Class classEnrollment;
}
