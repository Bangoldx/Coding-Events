package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {


    @GetMapping
    public String eventLists(Model model){
        List<String> events = new ArrayList<>();
        events.add("State of Play");
        events.add("E3");
        events.add("Apple WWDC");
        events.add("Video Game Awards");
        events.add("Console Release Date Announcement");
        model.addAttribute("events", events);
        return "events/index";
    }

    //lives at /events/create
@GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

}