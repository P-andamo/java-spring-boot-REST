package springboottestexample.springboottestexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboottestexample.springboottestexample.entity.Event;

public interface EventRepository  extends JpaRepository<Long, Event> {
}
