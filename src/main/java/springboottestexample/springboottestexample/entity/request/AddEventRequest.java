package springboottestexample.springboottestexample.entity.request;

import java.util.Date;

public class AddEventRequest {

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

    public String getEventDate() {
        return eventDate;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public boolean isMedicineInDurationOfEvent() {
        return medicineInDurationOfEvent;
    }

    public int getTemperature() {
        return temperature;
    }
}
