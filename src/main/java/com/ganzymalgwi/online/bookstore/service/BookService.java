package com.ganzymalgwi.online.bookstore.service;

import com.ganzymalgwi.online.bookstore.data.model.Book;

import java.util.List;

public interface BookService {
    Book saveBok(Book book);

    void deleteBook(Long id);

    List<Book> findAllBoks();
}
