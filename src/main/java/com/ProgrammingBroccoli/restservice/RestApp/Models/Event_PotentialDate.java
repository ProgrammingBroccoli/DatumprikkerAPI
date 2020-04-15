package com.ProgrammingBroccoli.restservice.RestApp.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.UUID;

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

    public Event_PotentialDate(Event event, String date){
        this.event = event;
        this.date = date;
    }

    public Event_PotentialDate(@JsonProperty("eventId") UUID eventId,
                               @JsonProperty("date") String date){
        this.event = event;
        this.date = date;
    }

    public Event_PotentialDate(){

    }
}
