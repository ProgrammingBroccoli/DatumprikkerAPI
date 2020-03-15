package com.ProgrammingBroccoli.restservice.RestApp.Controllers;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Event;
import com.ProgrammingBroccoli.restservice.RestApp.Services.EventLogic;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.hibernate.validator.constraints.CodePointLength;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    EventLogic logic;

    public EventController(){
        logic = new EventLogic();
    }

    @PostMapping ("/Event/Create")
    public void CreateEvent(String eventName, String description){
        Event event = new Event(eventName, description);
    }

    @GetMapping ("Event/All")
    public ResponseEntity<String> GetAllEvents(){
        String jsonA = JSONArray.toJSONString(logic.GetAllEvents());
        return new ResponseEntity<String>(jsonA, HttpStatus.OK);
    }
}
