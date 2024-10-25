package com.moviebookingApp.moviebookingApp.model;

import jakarta.persistence.*;

@Entity
public class user {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String username;
    private String email;
    private String password;



    void buyticket(){

    }


    void showticket(){

    }


    void cancelticket(){

    }

    

}
