package com.example.QuadTable.Service;

import com.example.QuadTable.Model.Book;
import com.example.QuadTable.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @CacheEvict(value = "book",allEntries = true)
    public Book createBookDetail(Book book) {
        return bookRepository.save(book);
    }

    @Cacheable("book")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @CacheEvict(value = "book",allEntries = true)
    public void delete(int book_id) {
        bookRepository.deleteById(book_id);
    }
}
