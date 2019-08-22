package springboottestexample.springboottestexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboottestexample.springboottestexample.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
