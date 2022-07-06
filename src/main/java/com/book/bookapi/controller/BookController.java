package com.book.bookapi.controller;

import com.book.bookapi.entity.Book;
import com.book.bookapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bookapi/v1")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/book/getbyid/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable(name = "id", required = true) Long id) {
        Optional<Book> checkBook = bookRepository.findById(id);
        if (checkBook.isPresent()) {
            return new ResponseEntity<Book>(checkBook.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/book/getbytitlelike/{title}")
    public ResponseEntity< List<Book> > getByTitleLike(@PathVariable(name = "title", required = false) String title) {
        List<Book> checkBooks = bookRepository.getByTitleLike(title.toUpperCase());

        if(!checkBooks.isEmpty()){
            return new ResponseEntity< List<Book> >(checkBooks, HttpStatus.OK);
        }
        else{
            return new ResponseEntity< List<Book>  >(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/book/createbook")
    public Book createBook(@RequestBody(required = true) Book book) {
        return bookRepository.save(book);
    }


    @PutMapping("/book/updatebook")
    public ResponseEntity<Book> updateBook(@RequestBody(required = true) Book book) {
        Optional<Book> checkBook = bookRepository.findById(book.getId());

        if (checkBook.isPresent()) {
            bookRepository.save(book);
            return new ResponseEntity<Book>(checkBook.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/book/deletebook")
    public ResponseEntity<Book> deleteBook(@RequestParam Long id){
        Optional<Book> checkBook = bookRepository.findById(id);
        if( checkBook.isPresent() ){
            bookRepository.deleteById(id);
            return new ResponseEntity<Book>(checkBook.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
