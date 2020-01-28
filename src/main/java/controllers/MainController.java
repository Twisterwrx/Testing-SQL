package controllers;


import entity.Book;
import exceptions.BookNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(path = "/demo")
@Service

public class MainController {

    @Autowired

    @PostMapping
    public Book addNewBook(Book book) {
        return addNewBook(book);
    }

    @GetMapping
    public Iterable<Book> getAllBooks(@RequestParam(name = "id", required = false)) {
        return getAllBooks();

        public Iterable<Book> getAllBooks (@RequestParam(name = "id", required = true)) {
        return getAllBooks(id);
    }
    }

    @Autowired
    @PutMapping
    public Book updateNote(@PathVariable Long id, @Valid @RequestBody Book) throws BookNotFoundException {
        this.addNewBook(Book);
        return updateNote(Book);
    }

    @Autowired
    @DeleteMapping
    public ResponseEntity deleteBook(@PathVariable(value = "Id") Long bookId) {
        getAllBooks().deleteBook(id);
        return deleteBook(id);
    }
}
