package com.roro.gh.copilot.demo.repositories;

import com.roro.gh.copilot.demo.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
