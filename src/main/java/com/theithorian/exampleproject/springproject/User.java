package com.theithorian.exampleproject.springproject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usr")
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "username", nullable = false, unique = true)
    private String firstName;

    @Column(name = "password", nullable = false)
    private String lastName;

}