package at.fhtw.be_webeng_23ws.service;

import at.fhtw.be_webeng_23ws.entity.Author;
import at.fhtw.be_webeng_23ws.entity.Book;
import at.fhtw.be_webeng_23ws.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }


}
