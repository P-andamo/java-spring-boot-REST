package springboottestexample.springboottestexample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalTime;
import java.util.Date;
import java.io.Serializable;

@Entity
public class Event implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private int monthId;
    private String eventDate;
    private String beginTime;
    private String endTime;
    private int duration;
    private String description;
    private boolean medicineInDurationOfEvent;
    private int temperature;

    public int getMonthId() {
        return monthId;
    }

    public void setMonthId(int monthId) {
        this.monthId = monthId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMedicineInDurationOfEvent() {
        return medicineInDurationOfEvent;
    }

    public void setMedicineInDurationOfEvent(boolean medicineInDurationOfEvent) {
        this.medicineInDurationOfEvent = medicineInDurationOfEvent;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return " Event Date: " + this.eventDate + " || " +
                                "beginTime: " + this.beginTime + " || " +
                                "endTime: " + this.endTime + " || " +
                                "duration: " + this.duration + " || " +
                                "description: " + this.description + " || " +
                                "medicineInDurationOfEvent: " + this.medicineInDurationOfEvent + " || " +
                                "temperature: " + this.temperature;
    }
}
