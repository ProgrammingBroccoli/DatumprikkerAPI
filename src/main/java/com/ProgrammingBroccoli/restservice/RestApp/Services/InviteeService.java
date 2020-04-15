package com.ProgrammingBroccoli.restservice.RestApp.Services;

import com.ProgrammingBroccoli.restservice.RestApp.Interfaces.InviteeRepository;
import com.ProgrammingBroccoli.restservice.RestApp.Models.Invitee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;

@Service
public class InviteeService {
    @Autowired
    public InviteeRepository repository;

    public void SaveInvitee(Invitee invitee){
        repository.save(invitee);
    }

}
