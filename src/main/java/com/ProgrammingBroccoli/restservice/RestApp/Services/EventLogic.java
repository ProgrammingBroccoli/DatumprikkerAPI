package com.ProgrammingBroccoli.restservice.RestApp.Services;

import com.ProgrammingBroccoli.restservice.RestApp.Models.Event;
import com.ProgrammingBroccoli.restservice.RestApp.Repository.EventContext;

import java.util.List;
public class EventLogic {
    EventContext context;

    public List<Event> GetAllEvents() {
        return context.GetAllEvents();
    }
}
