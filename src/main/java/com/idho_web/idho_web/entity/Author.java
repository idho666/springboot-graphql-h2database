package com.idho_web.idho_web.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Created by Idho.
 * Date: 30/06/2024
 * Time: 22:20
 */
@Data
@Entity
public class Author {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
}
