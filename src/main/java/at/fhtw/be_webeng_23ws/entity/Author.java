package at.fhtw.be_webeng_23ws.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Author {
    @Id
    @Setter(AccessLevel.NONE) //not able to set from outside
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)//, mappedBy = "author")
    private List<Book> books = new ArrayList<>();

    public Author(String name) {
        this.name = name;
        //this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
