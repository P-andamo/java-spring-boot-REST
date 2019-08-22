package springboottestexample.springboottestexample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
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
