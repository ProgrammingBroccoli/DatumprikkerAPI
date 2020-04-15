package com.ProgrammingBroccoli.restservice.RestApp.Controllers;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Event;
import com.ProgrammingBroccoli.restservice.RestApp.Services.EventService;
import com.ProgrammingBroccoli.restservice.RestApp.Services.InviteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/event")
@RestController

public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> GetAllEvents(){
        return eventService.GetAllEvents();
    }

    @PostMapping
    public void CreateEvent(@RequestBody Event event){
        eventService.CreateEvent(event);
    }


}
