package kh.edu.istad.b02_m2_restAPI.controller;

import kh.edu.istad.b02_m2_restAPI.model.User;
import kh.edu.istad.b02_m2_restAPI.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//UI standard
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAll(){
        return userRepository.selectAll();
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable UUID id){
        return userRepository.selectById(id).orElse(null);
    }
    @PostMapping
    public User create(@RequestBody User user) {
        return userRepository.insert(user);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        userRepository.deleteById(id);
    }


}
