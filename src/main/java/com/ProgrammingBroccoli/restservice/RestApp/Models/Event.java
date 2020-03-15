package com.ProgrammingBroccoli.restservice.RestApp.Models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

public class Event {
    //USE DATETIME FORMATTER FOR TIMES
    String Name;
    String Description;

    public Event(String name, String Description){
        this.Name = name;
        this.Description = Description;
    }
}
