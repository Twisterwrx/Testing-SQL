package ru.twisterbuild.sql.service;

import ru.twisterbuild.sql.entity.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Book addNewBook(Book book);

    Iterable<Book> getAllBooks();

    Book updateNote(Book book);

    void deleteBook(Integer id);

}

