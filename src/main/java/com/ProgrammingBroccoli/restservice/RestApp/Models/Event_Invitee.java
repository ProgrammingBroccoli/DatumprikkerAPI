package com.ProgrammingBroccoli.restservice.RestApp.Models;

import javax.persistence.*;

@Entity
@Table(name = "Event_Invitee")
public class Event_Invitee {

    @Id
    @GeneratedValue
    public long id;

    @ManyToOne
    public Event event;

    @ManyToOne
    public Invitee invitee;


    public Event_Invitee(){

    }
    public Event_Invitee(Event event, Invitee invitee){
        this.event = event;
        this.invitee = invitee;
    }
}
