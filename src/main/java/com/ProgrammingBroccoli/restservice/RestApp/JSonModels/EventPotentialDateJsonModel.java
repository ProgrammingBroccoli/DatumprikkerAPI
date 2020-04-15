package com.ProgrammingBroccoli.restservice.RestApp.JSonModels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class EventPotentialDateJsonModel {
    public UUID eventId;
    public String date;
    public EventPotentialDateJsonModel(@JsonProperty("eventId") UUID eventId,
                                       @JsonProperty("date") String date){
        this.eventId = eventId;
        this.date = date;
    }
}
