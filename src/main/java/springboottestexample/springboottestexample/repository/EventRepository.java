package springboottestexample.springboottestexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboottestexample.springboottestexample.entity.Event;

@Repository
public interface EventRepository  extends JpaRepository<Event, Long> {
}
