package com.ProgrammingBroccoli.restservice.RestApp.Interfaces;

import com.ProgrammingBroccoli.restservice.RestApp.Models.Event_PotentialDate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventPotentialDateRepository extends CrudRepository<Event_PotentialDate, Long> {
}
