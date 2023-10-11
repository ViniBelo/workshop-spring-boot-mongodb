package com.vinibelo.workshopmongo.services;

import com.vinibelo.workshopmongo.domain.entities.User;
import com.vinibelo.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        return repository.findAll();
    }
}
