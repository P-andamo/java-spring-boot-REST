package springboottestexample.springboottestexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springboottestexample.springboottestexample.entity.Event;
import springboottestexample.springboottestexample.entity.request.AddEventRequest;
import springboottestexample.springboottestexample.repository.EventRepository;

import java.io.*;
import java.util.List;

@RestController
public class EventController{

    private EventRepository eventRepository;
    private String DBfile = "DB.txt";

    @Autowired
    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @RequestMapping(path="/allevents", method = RequestMethod.GET)
    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    @RequestMapping(path="/addevent", method = RequestMethod.POST)
    public void addEvent(@RequestBody AddEventRequest addEventRequest) throws IOException {


        /**
         * This code is for connecting tha data income from URL request, to JPA (in this case
         *  JPA is connected to H2 Database the dialect is Hibernate)
         */

        Event event = new Event();
        event.setMonthId(addEventRequest.getMonthId());
        event.setEventDate(addEventRequest.getEventDate());
        event.setBeginTime(addEventRequest.getBeginTime());
        event.setEndTime(addEventRequest.getEndTime());
        event.setDuration(addEventRequest.getDuration());
        event.setDescription(addEventRequest.getDescription());
        event.setTemperature(addEventRequest.getTemperature());
        event.setMedicineInDurationOfEvent(addEventRequest.isMedicineInDurationOfEvent());
        //eventRepository.save(event);

        if(DBfile.length() == 0){
            writeToFile(event.toString());
        }else{
            appendToFile(event.toString());
        }
    }


    private void writeToFile(String event)
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(DBfile));
        writer.write(event  +"\r\n"+"=============================================================================================================");

        writer.close();
    }

    private void appendToFile(String event)
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(DBfile, true));
        writer.append("=============================================================================================================");
        writer.append("\r\n"+ event + "\r\n"+"=============================================================================================================");

        writer.close();
    }
}
