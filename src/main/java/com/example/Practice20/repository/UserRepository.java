package com.example.Practice20.repository;

import com.example.Practice20.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByFirstName(String firstName);
    List<User> findAllByLastName(String lastName);
    User findOneById(Long id);
}
