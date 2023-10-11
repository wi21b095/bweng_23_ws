package at.fhtw.be_webeng_23ws.service;

import at.fhtw.be_webeng_23ws.entity.Author;
import at.fhtw.be_webeng_23ws.entity.Book;
import at.fhtw.be_webeng_23ws.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBook(UUID id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
}
