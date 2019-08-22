package springboottestexample.springboottestexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springboottestexample.springboottestexample.entity.Event;
import springboottestexample.springboottestexample.entity.User;
import springboottestexample.springboottestexample.repository.EventRepository;
import springboottestexample.springboottestexample.repository.UserRepository;

import java.util.List;

@RestController
public class EventController{

    private EventRepository eventRepository;

    @Autowired
    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @RequestMapping(path="/allevents", method = RequestMethod.GET)
    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }
}
