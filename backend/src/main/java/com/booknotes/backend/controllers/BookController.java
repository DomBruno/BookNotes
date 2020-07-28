package com.booknotes.backend.controllers;

import com.booknotes.backend.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class BookController {

    @RestController
    @RequestMapping("/books") // optional
    public class BookController
    {
        @Autowired
        private BookService bookService;

    }
}
