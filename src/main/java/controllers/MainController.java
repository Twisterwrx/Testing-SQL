package controllers;


import entity.Book;
import exceptions.BookNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;

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
    Iterable<Book> getAllBooks() {
        return getAllBooks();
    }

    @PutMapping
    public void updateNote(@PathVariable Long bookId,@Valid @RequestBody Book bookDetails) throws BookNotFoundException {
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@PathVariable(value = "Id") Long bookId) {
         return deleteBook();
    }
}
