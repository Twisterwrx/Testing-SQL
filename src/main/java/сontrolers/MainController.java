package controlers;


import repository.BookRepository;
import repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")

public class MainController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(path="/add")
    public @ResponseBody Book addNewUser (Book book) {

      return  bookRepository.save(book);
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Book> getAllUsers() {
        return bookRepository.findAll();
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
