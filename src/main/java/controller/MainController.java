package controller;


import entity.Book;
import exception.BookNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@Service
// service.method()

public class MainController {

    @PostMapping
    public Book addNewBook(Book book) {
        return addNewBook(book);
    }

    @GetMapping
    public Iterable<Book> getAllBooks(@RequestParam(name = "id", required = false)) {
        return service.getAllBooks(id);
        }

    @PutMapping
    public Book updateNote(@PathVariable Long id, @Valid @RequestBody Book) throws BookNotFoundException {
        this.addNewBook(Book);
        return service.updateNote();
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@PathVariable(value = "Id") Long bookId) {
        getAllBooks().deleteBook(id);
        return service.deleteBook(id);
    }
}
