package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    @SequenceGenerator(name="person_seq", sequenceName="person_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="person_seq")
    private Long id;
    private String name;
    private String email;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

