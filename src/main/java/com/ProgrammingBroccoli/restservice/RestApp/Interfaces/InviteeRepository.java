package com.ProgrammingBroccoli.restservice.RestApp.Interfaces;

import com.ProgrammingBroccoli.restservice.RestApp.Models.Invitee;
import org.springframework.data.repository.CrudRepository;

public interface InviteeRepository extends CrudRepository<Invitee, Long> {
}
