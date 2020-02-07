package ru.twisterbuild.sql.service;

import org.springframework.http.ResponseEntity;
import ru.twisterbuild.sql.entity.Book;
import org.springframework.stereotype.Service;

@Service

public interface BookService {


    Book addNewBook(Book book);

    Iterable<Book> getAllBooks(Book book);

    Book updateNote(Book book);

    ResponseEntity deleteBook(Book book);

}

