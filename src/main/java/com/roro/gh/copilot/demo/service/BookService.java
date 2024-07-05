package com.roro.gh.copilot.demo.service;

import com.roro.gh.copilot.demo.repositories.BookRepository;
import com.roro.gh.copilot.demo.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository r;

    public Book addBook(Book book) {
        return r.save(book);
    }

    public List<Book> getAll() {
        return (List<Book>) r.findAll();
    }


    // COPILOT Demo (2): Explain this
    // COPILOT Demo (3): Refactor this
    // COPILOT Demo (4): Make this better
    public List<Book> findBooksByAuthorAndPriceRangeSorted(String a, double m, double v) {
            List<Book> f = (List<Book>) r.findAll();
            List<Book> r = new ArrayList<>();

            for (Book b : f) {
                if (b.getAuthor().equalsIgnoreCase(a)) {
                    if (b.getPrice() >= m && b.getPrice() <= v) {
                        r.add(b);
                    }
                }
            }

            for (int i = 0; i < r.size(); i++) {
                for (int j = i + 1; j < r.size(); j++) {
                    if (r.get(i).getTitle().compareToIgnoreCase(r.get(j).getTitle()) > 0) {
                        Book temp = r.get(i);
                        r.set(i, r.get(j));
                        r.set(j, temp);
                    }
                }
            }

            return r;
        }

}
