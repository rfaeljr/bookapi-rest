package com.book.bookapi.repository;

import com.book.bookapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository  extends JpaRepository<Book, Long> {
    @Query("select b from Book b where UPPER(b.title) like %:title% order by b.title")
    public List<Book> getByTitleLike(@Param("title") String title);
}
