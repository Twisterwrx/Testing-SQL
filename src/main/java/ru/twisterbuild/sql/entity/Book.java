package ru.twisterbuild.sql.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter

@Entity
@Table (name = "books_info")
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Email(regexp=".@.\\..*", message = "Email should be valid")
    private String email;

    @NotNull
    @Column (name = "name", length=50,nullable = false)
    private String name;

    @NotNull
    @Column (name = "author", length = 30, nullable = false)
    private String author;

    @NotNull
    @Column (name = "cost", scale = 2, nullable = false)
    private Double cost;

}
