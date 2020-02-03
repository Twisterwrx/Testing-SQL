package controller;


import entity.Book;
import exception.BookNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import service.impl.BookService;
import services.BookServiceImpl;

import javax.validation.Valid;
import javax.xml.ws.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@Service

public class MainController {

    @PostMapping
    public Book addNewBook(Book book) {

        return BookService.addNewBook (book);
    }

    @GetMapping
    public Iterable<Book> getAllBooks(@RequestParam(name = "id", required = false)) {
      return BookService.getAllBooks();
        }

    @PutMapping
    public Book updateNote(@PathVariable Long id, @Valid @RequestBody Book) throws BookNotFoundException {
        return BookService.updateNote();
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@PathVariable(value = "Id") Long book Id) {

        return BookService.deleteBook (id);
    }
}
