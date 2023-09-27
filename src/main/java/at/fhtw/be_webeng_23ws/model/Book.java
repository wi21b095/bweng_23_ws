package at.fhtw.be_webeng_23ws.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Book {
    private UUID id = UUID.randomUUID();
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;

        author.addBook(this);
    }
}
