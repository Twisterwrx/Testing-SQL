package service.impl;

import entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface BookService {

    public Book addNewBook (Book book);

    public List<Book> getAllBooks();

    public void updateNote (Book book);

    public void deleteBook (Book id);
}

