package com.example.Practice20.service;

import com.example.Practice20.models.User;
import com.example.Practice20.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findByFirstName(String firstName) {
        log.info("Find user by first name " + firstName);
        return userRepository.findAllByFirstName(firstName);
    }
    public List<User> findByLastName(String lastName) {
        log.info("Find user by last name " + lastName);
        return userRepository.findAllByLastName(lastName);
    }
    public User findById(Long id) {
        log.info("Find user by id " + id);
        return userRepository.findOneById(id);
    }

}
