package springboottestexample.springboottestexample.controller;

import springboottestexample.springboottestexample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboottestexample.springboottestexample.entity.request.AddUserRequest;
import springboottestexample.springboottestexample.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(path="/allusers", method = RequestMethod.GET)
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(path = "/adduser", method = RequestMethod.POST)
    public void addUSer(@RequestBody AddUserRequest addUserRequest) {
        User user = new User();
        user.setName(addUserRequest.getName());
        user.setSurname(addUserRequest.getSurname());
        userRepository.save(user);
    }

}