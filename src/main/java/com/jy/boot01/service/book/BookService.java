package com.jy.boot01.service.book;

import com.jy.boot01.entity.book.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    Map<String,Object> selectBookList(Book book);

    void insertBook(Book book);

    void deleteBookByID(Book book);

    void updateBookByID(Book book);

    Book selectBookInfoByID(Book book);

    void updateBookInfoByID(Book book);
}
