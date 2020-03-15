package com.ProgrammingBroccoli.restservice.RestApp.Repository;
import com.ProgrammingBroccoli.restservice.RestApp.Interfaces.IEventContext;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Event;
import java.util.List;

public class EventContext implements IEventContext {
    public List<Event> events;

    public EventContext() {
        events.add(new Event("Uiteten", "Uiteten met de fam"));
        events.add(new Event("Walibi", "Walibi mit freunden"));
        events.add(new Event("Bioscoop", "Fillum met eten"));
    }


    public void CreateEvent(Event event){
        events.add(event);
    }

    public List<Event> GetAllEvents() {
        return events;
    }
}
