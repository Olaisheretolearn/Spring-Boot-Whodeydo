package com.whodey.Whodeydo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter  // Lombok will generate getter and setter methods for all fields
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String phone;

    private String location;

    private String profilePicture;

    @Column(name = "date_joined")
    private String dateJoined;
}
