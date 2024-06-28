package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "faculty")
@Getter
@Setter
@ToString
public class Faculty {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "fac_name")
    private String name;
    @Column(name = "fac_email")
    private String email;
    @Column(name = "fac_address")
    private String address;

}
