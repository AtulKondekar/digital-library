package com.tech.digitallibrary.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private int age;
    private String country;
    @OneToMany(mappedBy = "id")
    private List<Book> listOfBooks;
}
