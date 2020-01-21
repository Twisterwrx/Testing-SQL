package services.impl;

import entity.Book;
import org.springframework.stereotype.Service;

@Service

public interface BookInterface {

    public void addNewBook (Book book);

    public void getAllBooks(Book book);

    public void updateNote (Book book);

    public void deleteBook (Book book);
}

