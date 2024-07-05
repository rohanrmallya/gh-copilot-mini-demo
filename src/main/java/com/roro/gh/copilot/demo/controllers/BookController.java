package com.roro.gh.copilot.demo.controllers;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.roro.gh.copilot.demo.service.BookService;
import com.roro.gh.copilot.demo.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    BookService service;

    @GetMapping("/book")
    public List<Book> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return service.getAll();

    }

    @PostMapping("/book")
    public Book addBok(@RequestBody Book book ) {
        Book added = service.addBook(book);
        return added;
    }

    // COPILOT: Is this correct? @PostMapping
    // COPILOT: Make this better
    @PostMapping("/findbook")
    public List<Book> findBook(@RequestBody Map<String, String> data){
        String author = data.get("author");
        Double from = Double.parseDouble(data.get("from"));
        Double to = Double.parseDouble(data.get("to"));
        return service.findBooksByAuthorAndPriceRangeSorted(author, from, to);

    }
}