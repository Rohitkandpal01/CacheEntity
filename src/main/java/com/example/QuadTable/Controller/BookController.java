package com.example.QuadTable.Controller;


import com.example.QuadTable.Model.Book;
import com.example.QuadTable.Model.Car;
import com.example.QuadTable.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/createBook")
    private Book createBookData(@RequestBody Book book){
        return bookService.createBookDetail(book);
    }

    @GetMapping("/getBook")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @DeleteMapping("/deleteBook")
    public void delete(@RequestParam("book_id")int book_id){
        bookService.delete(book_id);
    }
}
