package com.Book.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.Book.Repository.BookRepository;
import com.Book.entity.Book;

@Controller
public class BookController {

    @Autowired
    private BookRepository repo;

    //@QueryMapping → Maps to type Query it worked as getMapping annotation
    @QueryMapping
    public List<Book> allBooks() {
        return repo.findAll();
    }

    @QueryMapping
    public Book bookById(@Argument Long id) {
        return repo.findById(id).orElse(null);
    }

    //@MutationMapping → Maps to type Mutation  it works as postMapping annotation
    @MutationMapping
    public Book addBook(@Argument String title, @Argument String author) { //@Argument → GraphQL input parameters worked for input values
        return repo.save(new Book(title, author));
    }
}
