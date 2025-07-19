package com.tekarch.tafDataStore.Controllers;

import com.tekarch.tafDataStore.Entity.User;
//import com.tekarch.tafDataStore.Interfaces.UserServiceInterface;
import com.tekarch.tafDataStore.Repositories.UserRepository;
//import com.tekarch.tafDataStore.Services.Interfaces.UserInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/datastore")
//public class UserController {

//    private final UserInterface userInterface;
//
//    @PostMapping("/users")
//    public User registerUser(@RequestBody User user) {
//        return userInterface.saveUser(user);
//    }
//
//    @GetMapping("/users/{userId}")
//    public User getUser(@PathVariable Long userId) {
//        return userInterface.findById(userId).orElse(null);
//    }
//
//    @PutMapping("/users/{userId}")
//    public User updateUser(@PathVariable Long userId, @RequestBody User user) {
//        user.setId(userId);
//        return userInterface.save(user);
//    }
//
//    @GetMapping("/users")
//    public List<User> getAllUsers() {
//        return userInterface.findAll();
//    }
//}
@RestController
@RequestMapping("/datastore/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return userRepository.findById(id).map(user -> {
            user.setUsername(userDetails.getUsername());
            user.setEmail(userDetails.getEmail());
            user.setPhone(userDetails.getPhone());
            user.setUpdatedAt(userDetails.getUpdatedAt());
            return userRepository.save(user);
        }).orElseThrow(() -> new RuntimeException("User not found"));
    }
}



