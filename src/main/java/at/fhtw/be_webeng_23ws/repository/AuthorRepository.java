package at.fhtw.be_webeng_23ws.repository;

import at.fhtw.be_webeng_23ws.entity.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface AuthorRepository extends CrudRepository<Author, UUID> {
    List<Author> findAll();
}
