package com.moviebookingApp.moviebookingApp.model;

import jakarta.persistence.*;

@Entity
public class movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String title;
    private String genre;
    private String description;
    

}
