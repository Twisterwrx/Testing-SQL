package ru.twisterbuild.controller.repository;

import ru.twisterbuild.controller.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Integer> {

}
