package com.ProgrammingBroccoli.restservice.RestApp.Interfaces;

import com.ProgrammingBroccoli.restservice.RestApp.Models.Event;

import java.util.List;

public interface IEventContext {
    void CreateEvent(Event event);
    List<Event> GetAllEvents();
}
