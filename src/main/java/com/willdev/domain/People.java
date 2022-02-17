package com.willdev.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="people")

public class People {

    private Long id;
    private String name;
    private String lastName;
    private int age;
    private String gender;
    private String correo;

}
