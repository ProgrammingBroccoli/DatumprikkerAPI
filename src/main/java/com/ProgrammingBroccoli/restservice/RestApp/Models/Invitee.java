package com.ProgrammingBroccoli.restservice.RestApp.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "invitees")
public class Invitee {
    @Id
    @GeneratedValue
    public long id;

    @Column
    public String name;

    @Column
    public String email;

    @ManyToOne
    public Event event;


    public Invitee(@JsonProperty("name") String name,
                   @JsonProperty("email") String email){
        this.name = name;
        this.email = email;
    }
    public Invitee(String name, String email, Event event){
        this.name = name;
        this.email = email;
        this.event = event;
    }

    public Invitee(){

    }
}
