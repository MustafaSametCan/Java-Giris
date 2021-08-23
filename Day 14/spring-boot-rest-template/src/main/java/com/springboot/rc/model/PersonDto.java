package com.springboot.rc.model;

import java.util.List;

public class PersonDto {
    private Long id;
    private String name;
    private String surname;
    private List<String> addresse;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getAddresse() {
        return addresse;
    }

    public void setAddresse(List<String> addresse) {
        this.addresse = addresse;
    }

}
