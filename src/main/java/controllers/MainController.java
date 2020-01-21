package controllers;


import entity.Book;
import exceptions.BookNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/demo")

public class MainController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Book addNewBook(Book book) {
        return bookRepository.save(book);
    }

    @GetMapping
    Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PutMapping
    public void updateNote(@PathVariable Long bookId,@Valid @RequestBody Book bookDetails) throws BookNotFoundException {
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@PathVariable(value = "bookId") Long bookId) {
        bookRepository.delete(bookId);
        return ResponseEntity.ok().build();
    }
}
