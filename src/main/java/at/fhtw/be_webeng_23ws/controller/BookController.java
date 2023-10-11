package at.fhtw.be_webeng_23ws.controller;

import at.fhtw.be_webeng_23ws.model.Book;
import at.fhtw.be_webeng_23ws.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable UUID id) {
        return bookService.getBook(id);
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
}
