package ru.twisterbuild.controller.service.impl;

import org.springframework.http.ResponseEntity;
import ru.twisterbuild.controller.entity.Book;
import org.springframework.stereotype.Service;

@Service

public interface BookService {


    Book addNewBook(Book book);

    Iterable<Book> getAllBooks(Book book);

    Book updateNote(Book book);

    ResponseEntity deleteBook(Book book);

}

