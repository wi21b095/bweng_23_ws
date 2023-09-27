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
        Author jrrTolkien = new Author(1, "J.R.R. Tolkien");
        Author georgeOrwell = new Author(2, "George Orwell");
        Author agathaChristie = new Author(3, "Agatha Christie");

        Book theHobbit = new Book( "The Hobbit", jrrTolkien);
        Book book1984 = new Book( "1984", georgeOrwell);
        Book deathOnTheNile = new Book("Death on the Nile", agathaChristie);
        Book animalfarm = new Book("Animalfarm", georgeOrwell);


        books.addAll(List.of(theHobbit, book1984, deathOnTheNile, animalfarm));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(String id) {
        return books.stream().filter(book -> book.getId().toString().equals(id)).findFirst().orElseThrow();
    }

    public Book createBook(Book book) {
        Book createdBook = new Book(book.getTitle(), book.getAuthor());
        books.add(book);
        return null;
    }
}
