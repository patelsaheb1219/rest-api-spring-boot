package com.sample.restapis.services;

import com.sample.restapis.dtos.User;
import com.sample.restapis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return  userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
