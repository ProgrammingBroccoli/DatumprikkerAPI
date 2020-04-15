package com.ProgrammingBroccoli.restservice.RestApp.Models;

import javax.persistence.*;

@Entity
@Table(name = "invitees")
public class Invitee {
    @Id
    @GeneratedValue
    public long id;

    @Column
    public String name;

    public Invitee(int id, String name){
        this.id = 1;
        this.name = name;
    }
    public Invitee(){

    }
}
