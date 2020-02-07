package ru.twisterbuild.sql.repository;

import ru.twisterbuild.sql.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Integer> {

}
