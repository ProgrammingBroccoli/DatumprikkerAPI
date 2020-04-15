package com.ProgrammingBroccoli.restservice.RestApp.Models;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "events")
public class Event {
    //USE DATETIME FORMATTER FOR TIMES
    @Id
    @GeneratedValue
    public Long id;

    @Column
    public String name;

    @Column
    public String description;

    @OneToOne
    public User organizer;

    public Event(){

    }

    public Event (@JsonProperty("name") String name,
                  @JsonProperty("description") String description){
        this.name = name;
        this.description = description;
    }


}
