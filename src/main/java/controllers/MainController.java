package controllers;


import entity.Book;
import exceptions.BookNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import javax.xml.ws.ServiceMode;

@RestController
@RequestMapping(path = "/demo")
@Service

public class MainController {

    @PostMapping
    public Book addNewBook(Book book) {
        return addNewBook(book);
    }

    @GetMapping
    Iterable<Book> getAllBooks() {
        return getAllBooks();
    }

    @PutMapping
    public void updateNote(@PathVariable Long Id,@Valid @RequestBody Book book) throws BookNotFoundException {
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@PathVariable(value = "Id") Long Id) {
         return deleteBook();
    }
}
