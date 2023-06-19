package com.ganzymalgwi.online.bookstore.service;

import com.ganzymalgwi.online.bookstore.data.model.Book;
import com.ganzymalgwi.online.bookstore.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    @Autowired
    private final BookRepository bookRepository;

    @Override
    public Book saveBok(Book book){
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBoks(){
        return bookRepository.findAll();
    }
}
