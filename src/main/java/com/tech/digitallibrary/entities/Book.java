package com.tech.digitallibrary.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne()
    @JoinColumn(name="author_id")
    private Author authorId;
    private int numberOfPages;
    private String language;
    private boolean available;
    private String genre;
    private String IsbnNumber;
    private Date Date;

}
