package interfaces;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service

public interface PutBook {

    void updateNote(Object bookId, Object bookDetails, Object book_name, Object author_name, Object cost, Object Book) {
        Page <BookView> getBookDetails (Long bookId, Book bookDetails, Object book_name, Object author_name, Double cost);
    }
}
