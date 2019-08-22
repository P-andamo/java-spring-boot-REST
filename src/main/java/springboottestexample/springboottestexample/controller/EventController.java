package springboottestexample.springboottestexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import springboottestexample.springboottestexample.entity.Event;
import springboottestexample.springboottestexample.repository.EventRepository;
import springboottestexample.springboottestexample.repository.UserRepository;

@RestController
public class EventController{

    private EventRepository eventRepository;

    @Autowired
    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
}
