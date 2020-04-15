package com.ProgrammingBroccoli.restservice.RestApp.Controllers;

import com.ProgrammingBroccoli.restservice.RestApp.JSonModels.EventPotentialDateJsonModel;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Event_PotentialDate;
import com.ProgrammingBroccoli.restservice.RestApp.Services.EventPotentialDateService;
import com.ProgrammingBroccoli.restservice.RestApp.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/event_potentialDate")
public class Event_PotentialdateController {

    @Autowired
    public EventPotentialDateService dateService;
    @Autowired
    public EventService eventService;

    @PostMapping
    public void NewPotentialDate(@RequestBody EventPotentialDateJsonModel potentialDate){
        var event = eventService.GetEventById(potentialDate.eventId);
        Event_PotentialDate date = new Event_PotentialDate(event, potentialDate.date);
        dateService.SaveDate(date);
    }

}
