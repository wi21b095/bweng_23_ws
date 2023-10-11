package at.fhtw.be_webeng_23ws.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Author {
    private UUID id;
    private String name;
    @JsonIgnore
    private List<Book> books = new ArrayList<>();

    public Author(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
