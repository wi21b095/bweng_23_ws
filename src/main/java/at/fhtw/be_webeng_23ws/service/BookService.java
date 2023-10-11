package at.fhtw.be_webeng_23ws.service;

import at.fhtw.be_webeng_23ws.model.Author;
import at.fhtw.be_webeng_23ws.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookService {

    List<Book> books = new ArrayList<>();

    public BookService() {
        Author jrrTolkien = new Author(UUID.fromString("e9658112-f1cd-4448-94a3-f26a818afd24"), "J.R.R. Tolkien");
        Author georgeOrwell = new Author(UUID.fromString("dc846022-3f9f-4585-9b6c-02d1b4eaf7bb"), "George Orwell");
        Author agathaChristie = new Author(UUID.fromString("b3fd4de1-9cf8-4d8e-9d31-2d427ec845ab"), "Agatha Christie");

        Book theHobbit = new Book( UUID.fromString("ec8efe7f-6f06-4626-b500-14f91bfa8cc7"),"The Hobbit", jrrTolkien);
        Book book1984 = new Book( UUID.fromString("9dece02d-afdd-424e-ae83-d1f0b236080d"),"1984", georgeOrwell);
        Book deathOnTheNile = new Book(UUID.fromString("d7c56a44-0ac6-4760-b4f0-aaf0a2379321"),"Death on the Nile", agathaChristie);
        Book animalfarm = new Book(UUID.fromString("0d78e914-4ca3-45ab-8393-2e07b0600a21"),"Animalfarm", georgeOrwell);


        books.addAll(List.of(theHobbit, book1984, deathOnTheNile, animalfarm));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(UUID id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElseThrow();
    }

    public Book createBook(Book book) {
        Book createdBook = new Book(UUID.randomUUID(), book.getTitle(), book.getAuthor());
        books.add(book);
        return createdBook;
    }
}
