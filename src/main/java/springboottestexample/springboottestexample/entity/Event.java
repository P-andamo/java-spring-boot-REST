package springboottestexample.springboottestexample.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Event {
    @Id
    @GeneratedValue
    private long id;
    private Date eventDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
