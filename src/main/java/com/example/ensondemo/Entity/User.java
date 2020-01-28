package com.example.ensondemo.Entity;

import javax.persistence.*;


@Entity
@Table(name = "ufukkk")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer userId;
        @Column(name = "first_name" )
        String firstName;
        @Column(name = "last_name" )
        String lastName;


    public Integer getId() {
        return userId;
    }

    public void setId(Integer id) {
        this.userId= id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
