package com.ProgrammingBroccoli.restservice.RestApp.Interfaces;

import com.ProgrammingBroccoli.restservice.RestApp.Models.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EventRepository extends CrudRepository<Event, UUID> {

}
