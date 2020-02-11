package ru.twisterbuild.sql.service.impl;

import ru.twisterbuild.sql.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.twisterbuild.sql.repository.BookRepository;
import ru.twisterbuild.sql.service.BookService;

@Service

public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addNewBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateNote(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book id) { return bookRepository.delete(Book id);
    }
}



