package com.ProgrammingBroccoli.restservice.RestApp.Services;

import com.ProgrammingBroccoli.restservice.RestApp.Interfaces.EventPotentialDateRepository;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Event_PotentialDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventPotentialDateService {
    @Autowired
    public EventPotentialDateRepository repository;
    public void SaveDate(Event_PotentialDate date) {
        //repository.save(date);
    }
}
