package com.idho_web.idho_web.controller;

import com.idho_web.idho_web.entity.Book;
import com.idho_web.idho_web.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Idho.
 * Date: 30/06/2024
 * Time: 01:22
 */

@RestController
@RequestMapping("/api/books")
@Tag(name = "Book API", description = "CRUD operations for books")
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;


    @GetMapping
    @Operation(summary = "Get all books")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
