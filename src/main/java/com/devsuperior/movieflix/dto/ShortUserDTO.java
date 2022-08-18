package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.User;

import java.io.Serializable;

public class ShortUserDTO implements Serializable {

    private Long id;

    private String name;

    private String email;


    public ShortUserDTO() {
    }

    public ShortUserDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public ShortUserDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
    }

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
