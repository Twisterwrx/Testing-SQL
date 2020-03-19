package ru.twisterbuild.sql.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ru.twisterbuild.sql.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ru.twisterbuild.sql.service.BookService;

@RestController
@RequestMapping ("books")

public class MainController {
    @Autowired
    BookService bookService;

    @PostMapping
    public ResponseEntity addNewBook(@RequestBody Book book) {
        return new ResponseEntity (bookService.addNewBook(book), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getAllBooks(){
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateNote(@RequestBody Book book) {
        return new ResponseEntity (bookService.updateNote(book), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteBook(@RequestParam Integer id) {
        bookService.deleteBook(id);
        return new ResponseEntity( HttpStatus.NO_CONTENT);
    }
}
