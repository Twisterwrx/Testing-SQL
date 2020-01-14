package services;

import entity.Book;
import exceptions.BookNotFoundException;
import interfaces.PutBook;
import org.springframework.stereotype.Service;

@Service

public class PutService implements PutBook {

    Book book = bookRepository.findById(Math.toIntExact(bookId)).orElseThrow(() -> new BookNotFoundException(bookId));

        book.setBook_name(bookDetails.getBook_name());
        book.setAuthor_name(bookDetails.getAuthor_name());
        book.setCost(bookDetails.getCost());

    Book updatedBook = bookRepository.save(book);
    return;

    @Override
    public void updateNote(Object bookId, Object bookDetails, Object book_name, Object author_name, Object cost, Object Book) {

    }

}
