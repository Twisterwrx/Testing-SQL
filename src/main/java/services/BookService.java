package services;
//коммент
import entity.Book;
import exceptions.BookNotFoundException;
import org.springframework.stereotype.Service;
import services.impl.BookInterface;

@Service

public class BookService implements BookInterface {

    public void updateNote (Book book) {

        book = bookRepository.findById(Math.toIntExact(bookId)).orElseThrow(() -> new BookNotFoundException(bookId));
        book.setBook_name(bookDetails.getBook_name());
        book.setAuthor_name(bookDetails.getAuthor_name());
        book.setCost(bookDetails.getCost());

    Book updatedBook = bookRepository.save(book);
    return;

    }
}
