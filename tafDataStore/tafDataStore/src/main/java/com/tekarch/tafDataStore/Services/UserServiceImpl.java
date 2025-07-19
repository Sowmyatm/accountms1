//package com.tekarch.tafDataStore.Services;
//
//
//
//import com.tekarch.tafDataStore.Entity.User;
//import com.tekarch.tafDataStore.Repositories.UserRepository;
////import com.tekarch.tafDataStore.Interfaces.UserServiceInterface;
//import com.tekarch.tafDataStore.Services.Interfaces.UserInterface;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class UserServiceImpl implements UserInterface {
//
//    @Autowired
//    private final UserRepository userRepository;
//
//    @Override
//    public User registerUser(User user) {
//        return userRepository.save(user);
//    }
//
////    @Override
////    public User createUser(User user) {
////        return null;
////    }
//
//    @Override
//    public User getUser(Long userId) {
//        return userRepository.findById(userId) // Retrieve the user by ID
//                .orElseThrow(() -> new RuntimeException("User not found with id " + userId));
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    @Override
//    public User saveUser(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public Optional<User> findById(Long userId) {
//        return userRepository.findById(userId);
//    }
//
//    @Override
//    public User save(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public List<User> findAll() {
//        return userRepository.findAll();
//    }
//
//    @Override
//    public User updateUser(Long userId, User user) {
//        return null;
//    }
//}
//
