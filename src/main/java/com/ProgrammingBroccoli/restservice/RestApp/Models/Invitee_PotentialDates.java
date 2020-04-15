package com.ProgrammingBroccoli.restservice.RestApp.Models;

import javax.persistence.*;

@Entity
@Table(name = "Invitee_Event_PotentialDates")
public class Invitee_PotentialDates {
    @Id
    @GeneratedValue
    public long Id;

    @ManyToOne
    public Invitee invitee;

    @ManyToOne
    public Event_PotentialDate event_potentialDate;

    @Column
    public boolean available;
}
