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
    public ResponseEntity <Book> addNewBook(@RequestBody Book book) {
        bookService.addNewBook(book);
        return new ResponseEntity<>(Book, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity.BodyBuilder getAllBooks(){
        bookService.getAllBooks();
        return ResponseEntity.ok();

        /*2ой вариант
        public ResponseEntity<Iterable<Book>> getAllBooks() {
            bookService.getAllBooks();
            return new ResponseEntity.ok();*/
    }

    @PutMapping
    public ResponseEntity.BodyBuilder updateNote(@RequestBody Book book) {
        bookService.updateNote(book);
        return ResponseEntity.accepted();
    }

    @DeleteMapping
    public ResponseEntity.BodyBuilder deleteBook(@RequestParam Integer id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok();
    }
}
