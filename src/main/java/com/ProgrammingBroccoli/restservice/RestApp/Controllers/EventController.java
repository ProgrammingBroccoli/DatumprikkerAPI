package com.ProgrammingBroccoli.restservice.RestApp.Controllers;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Event;
import com.ProgrammingBroccoli.restservice.RestApp.Services.EventLogic;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/event")
@RestController

public class EventController {

    @Autowired
    private EventLogic logic;

    @GetMapping
    public List<Event> GetAllEvents(){
        return logic.GetAllEvents();
    }

    @PostMapping
    public void CreateEvent(@RequestBody Event event){
        logic.CreateEvent(event);
    }


}
