package com.ProgrammingBroccoli.restservice.RestApp.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

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
