package com.idho_web.idho_web.controller;

import com.idho_web.idho_web.entity.Book;
import com.idho_web.idho_web.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Idho.
 * Date: 27/06/2024
 * Time: 21:11
 */

@Controller
@AllArgsConstructor
public class HomeController {

    private final BookRepository bookRepository;


    @GetMapping("/")
    public String connectionTest() {
        return "index";
    }


    @QueryMapping
    Iterable<Book> book(){
        return bookRepository.findAll();
    }

}
