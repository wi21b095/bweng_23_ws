package at.fhtw.be_webeng_23ws.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Author {
    private int id; // for now
    private String name;
    @JsonIgnore
    private List<Book> books = new ArrayList<>();

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
