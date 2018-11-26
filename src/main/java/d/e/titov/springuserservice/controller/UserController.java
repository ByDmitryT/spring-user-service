package d.e.titov.springuserservice.controller;

import d.e.titov.springuserservice.entity.User;
import d.e.titov.springuserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{email}")
    public List<User> getUsersByEmail(@PathVariable String email) {
        return userService.getUsersByEmail(email);
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
