package controlers;


import repository.BookRepository;
import Classes.Book;
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
    public @ResponseBody Book addNewBook (Book) {
      return  bookRepository.save(Book);
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Book> getAllBook() {
        return bookRepository.findAll();
    }
}
