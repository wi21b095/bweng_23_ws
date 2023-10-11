package at.fhtw.be_webeng_23ws.repository;

import at.fhtw.be_webeng_23ws.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID> {
    List<Book> findByYear(int year);

    List<Book> findAll();
}
