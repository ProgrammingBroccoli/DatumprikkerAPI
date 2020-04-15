package com.ProgrammingBroccoli.restservice.RestApp.Controllers;

import com.ProgrammingBroccoli.restservice.RestApp.JSonModels.InviteeJsonModel;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Event;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Invitee;
import com.ProgrammingBroccoli.restservice.RestApp.Services.EventService;
import com.ProgrammingBroccoli.restservice.RestApp.Services.InviteeService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;

@RequestMapping("api/invitee")
@RestController
public class InviteeController {

    @Autowired
    public EventService eventService;
    @Autowired
    public InviteeService inviteeService;


    @PostMapping
    public void AssignInvitee(@RequestBody InviteeJsonModel model) {
        //Invitee newInvitee = new Invitee(invitee.name, invitee.email, invitee.event);
        var event = eventService.GetEventById(model.eventId);
        Invitee newInvitee = new Invitee(model.invitee.name, model.invitee.email, event);
        inviteeService.SaveInvitee(newInvitee);

    }
}
