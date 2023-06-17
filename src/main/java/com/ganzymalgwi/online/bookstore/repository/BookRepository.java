package com.ganzymalgwi.online.bookstore.repository;

import com.ganzymalgwi.online.bookstore.data.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
