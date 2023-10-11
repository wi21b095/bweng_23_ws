package at.fhtw.be_webeng_23ws.controller;

import at.fhtw.be_webeng_23ws.entity.Author;
import at.fhtw.be_webeng_23ws.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }
}
