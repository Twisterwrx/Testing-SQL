package ru.twisterbuild.controller.service.impl;

import ru.twisterbuild.controller.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface BookService {


    public Book addNewBook ();

    public List<Book> getAllBooks();

    public void updateNote ();

    public void deleteBook ();
}

