package controlers;


import entity.Book;
import exceptions.BookNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@RestController
@RequestMapping(path="/demo")

public class MainController {

    @Autowired
    private BookRepository bookRepository;
    private Book book;

    @PostMapping(path="/add")
        Book addNewBook (Book book) {

      return  bookRepository.save(book);
    }

    @GetMapping(path="/all")
        Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PutMapping("/books/{id}")
    public void updateNote(@PathVariable Long bookId,
                           @Valid @RequestBody Book bookDetails) throws BookNotFoundException {

            }

        @DeleteMapping("/books/{id}")
        public ResponseEntity deleteBook(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
           
            bookRepository.delete(book);
            return ResponseEntity.ok().build();
        }
}
