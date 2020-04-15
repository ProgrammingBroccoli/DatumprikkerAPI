package com.ProgrammingBroccoli.restservice.RestApp.Services;
import com.ProgrammingBroccoli.restservice.RestApp.Interfaces.EventRepository;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;


    public List<Event> GetAllEvents() {
        var it = eventRepository.findAll();
        var events = new ArrayList<Event>();

        it.forEach(e -> events.add(e));
        return events;
    }

    public void CreateEvent(Event event) {
        eventRepository.save(event);
    }


    public Event GetEventById(UUID eventId) {
        return eventRepository.findById(eventId).orElse(null);
    }
}
