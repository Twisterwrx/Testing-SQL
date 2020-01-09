package controlers;


import entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Controller
@RequestMapping(path="/demo")

public class MainController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    Book addNewBook (Book book) {

      return  bookRepository.save(book);
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Book> getAllUsers() {
        return bookRepository.findAll();
    }

    @PutMapping("/books/{id}")
    public void updateNote(@PathVariable Long bookId,
                           @Valid @RequestBody Book bookDetails) throws BookNotFoundException {

        Book book = bookRepository.findById(Math.toIntExact(bookId)).orElseThrow(() -> new BookNotFoundException(bookId));

        book.setBook_name(bookDetails.getBook_name());
        book.setAuthor_name(bookDetails.getAuthor_name());
        book.setCost(bookDetails.getCost());

        Book updatedBook = bookRepository.save(book);
        return;
    }

        @DeleteMapping("/books/{id}")
        public ResponseEntity deleteBook(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
            Book book = bookRepository.findById(Math.toIntExact(bookId))
                    .orElseThrow(() -> new BookNotFoundException(bookId));

            bookRepository.delete(book);
            return ResponseEntity.ok().build();
        }
}
