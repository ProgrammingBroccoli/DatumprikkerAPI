package com.ProgrammingBroccoli.restservice.RestApp.Models;

import javax.persistence.*;

@Entity
@Table(name = "event_potentialDates")
public class Event_PotentialDate {
    @Id
    @GeneratedValue
    public long id;
    @ManyToOne
    public Event event;
    @Column
    public String date;

    public Event_PotentialDate(int id, Event event, String date){
        this.id = id;
        this.event = event;
        this.date = date;
    }
    public Event_PotentialDate(){

    }
}
