package services;

import entity.Book;
import exceptions.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import repository.BookRepository;
import services.impl.BookInterface;

@Service

public class BookService implements BookInterface {
    @Autowired
    private BookRepository bookRepository;

    public void addNewBook(Book book) {

        book.setName(book.getName());
        book.setAuthor(book.getAuthor());
        book.setCost(book.getCost());

        return bookRepository.save(book);
    }

    public Iterable<Book> getAllBooks(Book book) {

        book = bookRepository.findById(Math.toIntExact(book.getId())).orElseThrow(() -> new BookNotFoundException(book.getId()));
        book = bookRepository.findByName(book.getName()).orElseThrow(() -> new BookNotFoundException(book.getName()));
        book = bookRepository.findByAuthor(book.getAuthor()).orElseThrow(() -> new BookNotFoundException(book.getAuthor()));
        book = bookRepository.findByCost(Math.toIntExact(book.getCost()).orElseThrow(() -> new BookNotFoundException(book.getCost())));

        return bookRepository.findAll();
    }

    public void updateNote(Book book) {

        book = bookRepository.findById(Math.toIntExact(book.getId())).orElseThrow(() -> new BookNotFoundException(book.getId()));
        book.setName(book.getName());
        book.setAuthor(book.getAuthor());
        book.setCost(book.getCost());

        Book updatedNote = bookRepository.save(book);

        return bookRepository.save(Book book);
    }

    public void deleteBook(Book book) {
        public ResponseEntity deleteBook (@PathVariable(value = "Id") Long book.getId(){
            bookRepository.delete(book.getId());
            return bookRepository.delete(book id);
        }
    }


}
