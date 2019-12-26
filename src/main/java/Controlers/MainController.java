package Controlers;


import repository.UserRepository;
import Classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.print.Book;

@Controller
@RequestMapping(path="/demo")

public class MainController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody User addNewUser (User user) {

      return  userRepository.save(user);
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PutMapping("/books/{id}")
    public Book updateNote(@PathVariable(value = "id") Long bookId,
                           @Valid @RequestBody Book bookDetails) throws BookNotFoundException {

        Book book = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));

        book.setBook_name(bookDetails.getBook_name());
        book.setAuthor_name(bookDetails.getAuthor_name());
        book.setCost(bookDetails.getCost());

        Book updatedBook = bookRepository.save(book);
        return updatedBook;
    }

        @DeleteMapping("/books/{id}")
        public ResponseEntity deleteBook(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
            Book book = bookRepository.findById(bookId)
                    .orElseThrow(() -> new BookNotFoundException(bookId));

            bookRepository.delete(book);
            return ResponseEntity.ok().build();
        }
}
