package ru.twisterbuild.controller.service;

import ru.twisterbuild.controller.entity.Book;
import ru.twisterbuild.controller.exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import ru.twisterbuild.controller.repository.BookRepository;
import ru.twisterbuild.controller.service.impl.BookService;

import javax.persistence.Id;

@Service

public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addNewBook(Book book) {
        book.setName(book.getName());
        book.setAuthor(book.getAuthor());
        book.setCost(book.getCost());
        return bookRepository.save(book);
    }

    @Override
    public Iterable<Book> getAllBooks(Book book) {
        return bookRepository.findAll();
    }

    @Override
    public Book updateNote(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        public ResponseEntity deleteBook (@PathVariable(value = "Id") long book.getId() {
            return bookRepository.delete(book id);
        }
    }


}
