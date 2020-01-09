package entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter

@Entity

public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String author;
    private Double cost;
    private Object book_name;
    private Object author_name;

    public Object getBook_name() {
        return book_name;
    }

    public Object getAuthor_name() {
        return author_name;
    }
}
