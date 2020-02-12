package ru.twisterbuild.sql.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import ru.twisterbuild.sql.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ru.twisterbuild.sql.service.BookService;

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
    public Iterable<Book> getAllBooks(){ return bookService.getAllBooks();
    }

    @PutMapping
    public Book updateNote(@RequestBody Book book) {
        return bookService.updateNote(book);
    }

    @DeleteMapping
    public ResponseEntity.BodyBuilder deleteBook(@RequestParam Integer id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok();
    }
}
