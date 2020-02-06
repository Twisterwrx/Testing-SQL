package ru.twisterbuild.controller.service;

import ru.twisterbuild.controller.entity.Book;
import ru.twisterbuild.controller.exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import ru.twisterbuild.controller.repository.BookRepository;
import ru.twisterbuild.controller.service.impl.BookService;

@Service

public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Service
    public Book addNewBook(Book book) {

        book.setName(book.getName());
        book.setAuthor(book.getAuthor());
        book.setCost(book.getCost());

        return bookRepository.save(book);
    }

    @Service
    public Iterable<Book> getAllBooks(Book book) {

        book = bookRepository.findById(Math.toIntExact(book.getId())).orElseThrow(() -> new BookNotFoundException(getAllBooks()));


        //ЭТОТ
            book.setName(Name name) () {
            this.name = name;
            return bookRepository(Book name);

            //ИЛИ ЭТОТ
            book.setName(String name()); {
                return bookRepository.findAll(Book name);

                        //ИЛИ ТАКОЙ ВОТ
                book.setName(getAllBooks(Book name)){
                    return bookRepository (Book name);
                }
            }

        }

        @Service
        public void updateNote (Book book){

            book = bookRepository.findById(Math.toIntExact(book.getId())).orElseThrow(() -> new BookNotFoundException(book.getId()));
            book.setName(book.getName());
            book.setAuthor(book.getAuthor());
            book.setCost(book.getCost());

            Book updatedNote = bookRepository.save(book);

            return bookRepository.save(Book book);
        }

        @Service
        public void deleteBook (Book book){
            public ResponseEntity deleteBook (@PathVariable(value = "Id") Long book.getId() {
                bookRepository.delete(book.getId());
                return bookRepository.delete(book id);
            }
        }


    }
