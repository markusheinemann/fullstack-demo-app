package com.accenture.kickstart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "firstName is mandatory")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "lastName is mandatory")
    @Column(name = "last_name")
    private String lastName;

    @NotBlank(message = "birthday is mandatory")
    private String birthday;

    @NotBlank(message = "country is mandatory")
    private String country;

    @NotNull(message = "married is mandatory")
    private String married;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getMarried() {
        return married == "Y";
    }

    public void setMarried(Boolean married) {
        this.married = married ? "Y" : "N";
    }

}
