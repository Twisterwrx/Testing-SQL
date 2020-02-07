package ru.twisterbuild.sql.controller;


import org.springframework.beans.factory.annotation.Autowired;
import ru.twisterbuild.sql.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ru.twisterbuild.sql.service.BookService;


import javax.validation.Valid;

@RestController
@Service

public class MainController<id> {
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
    public Book updateNote(@PathVariable Book id, @Valid @RequestBody Book) {
        return bookService.updateNote(id);
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@PathVariable long Id) {
        return bookService.deleteBook(id);
    }
}
