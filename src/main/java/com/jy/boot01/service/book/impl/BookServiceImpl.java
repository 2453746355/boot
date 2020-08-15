package com.jy.boot01.service.book.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jy.boot01.entity.book.Book;
import com.jy.boot01.mapper.book.BookMapper;
import com.jy.boot01.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void deleteBookByID(Book book) {
        bookMapper.deleteBookByID(book);
    }
    @Override
    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }
    @Override
    public Map<String, Object> selectBookList(Book book) {
        Map<String, Object> map = new HashMap<>();
        //开启分页
        Page<Object> page = PageHelper.startPage(book.getPage(), book.getLimit());
        List<Book> list = bookMapper.selectBookList(book);
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", page.getTotal());
        map.put("data", list);
        return map;
    }
    @Override
    public void updateBookByID(Book book) {
        bookMapper.updateBookByID(book);
    }
    @Override
    public Book selectBookInfoByID(Book book) {
        return bookMapper.selectBookInfoByID(book);
    }

    @Override
    public void updateBookInfoByID(Book book) {
        bookMapper.updateBookInfoByID(book);
    }
}
