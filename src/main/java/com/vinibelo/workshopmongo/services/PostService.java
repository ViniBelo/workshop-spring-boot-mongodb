package com.vinibelo.workshopmongo.services;

import com.vinibelo.workshopmongo.domain.Post;
import com.vinibelo.workshopmongo.repositories.PostRepository;
import com.vinibelo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    @GetMapping
    public Post findById(String id) {
        Optional<Post> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitle(text);
    }

    public List<Post> fullSearch(String text, LocalDate minDate, LocalDate maxDate) {
       maxDate = maxDate.plusDays(1);
       return repository.fullSearch(text, minDate, maxDate);
    }
}
