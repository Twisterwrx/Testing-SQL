package ru.twisterbuild.controller.controller;


import org.springframework.beans.factory.annotation.Autowired;
import ru.twisterbuild.controller.entity.Book;
import ru.twisterbuild.controller.exception.BookNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ru.twisterbuild.controller.service.impl.BookService;
import services.BookServiceImpl;

import javax.validation.Valid;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@Service

public class MainController {
    @Autowired
    BookService bookService;

    @PostMapping
    public Book addNewBook(Book book) {
        return bookService.addNewBook(book);
    }

    @GetMapping
    public Iterable<Book> getAllBooks(@RequestParam(name = "id", required = false)) {
        return bookService.getAllBooks();
    }

    @PutMapping
    public Book updateNote(@PathVariable long id, @Valid @RequestBody Book) {
        return bookService.updateNote();
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@PathVariable(value = "Id") long Id) {
        return bookService.deleteBook();
    }
}
