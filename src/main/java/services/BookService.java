package services;

import entity.Book;
import exceptions.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import services.impl.BookInterface;

@Service


public class BookService implements BookInterface {
    @Autowired

    public void addNewBook(Book book) {

        book.setBook_name(bookDetails.getBook_name());
        book.setAuthor_name(bookDetails.getAuthor_name());
        book.setCost(bookDetails.getCost());

        return bookRepository.save(book);
    }

    public void getAllBooks(Book book) {

        book = bookRepository.findById(Math.toIntExact(bookId)).orElseThrow(() -> new BookNotFoundException(bookId));
        book = bookRepository.findByBook_name(Math.toIntExact(book_name)).orElseThrow(() -> new BookNotFoundException(book_name));
        book = bookRepository.findByAuthor_name(Math.toIntExact(author_name)).orElseThrow(() -> new BookNotFoundException(author_name));
        book = bookRepository.findByCost(Math.toIntExact(cost)).orElseThrow(() -> new BookNotFoundException(cost));

        return bookRepository.findAll();
    }

    public void updateNote(Book book) {

        book = bookRepository.findById(Math.toIntExact(bookId)).orElseThrow(() -> new BookNotFoundException(bookId));
        book.setBook_name(bookDetails.getBook_name());
        book.setAuthor_name(bookDetails.getAuthor_name());
        book.setCost(bookDetails.getCost());

        Book updatedBook = bookRepository.save(book);

        return bookRepository.save(book);
    }

    public void deleteBook(Book book) {
        public ResponseEntity deleteBook (@PathVariable(value = "bookId") Long bookId){
            bookRepository.delete(bookId);
            return ResponseEntity.ok().build();
        }
    }
}
