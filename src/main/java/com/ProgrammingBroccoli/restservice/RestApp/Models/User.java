package com.ProgrammingBroccoli.restservice.RestApp.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    public Long id;

    @Column
    public String name;

    @Column
    public String email;

    public User (@JsonProperty("name") String name,
                 @JsonProperty("email") String email){
        this.name = name;
        this.email = email;

    }
    public User(){
    }



}
