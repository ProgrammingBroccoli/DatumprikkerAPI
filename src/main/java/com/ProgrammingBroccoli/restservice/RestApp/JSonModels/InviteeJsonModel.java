package com.ProgrammingBroccoli.restservice.RestApp.JSonModels;

import com.ProgrammingBroccoli.restservice.RestApp.Models.Invitee;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class InviteeJsonModel {
    public Invitee invitee;
    public UUID eventId;

    public InviteeJsonModel(@JsonProperty("invitee") Invitee invitee,
                            @JsonProperty("eventId") UUID eventId){
        this.invitee = invitee;
        this.eventId = eventId;

    }
}
