package com.jy.boot01.controller.book;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jy.boot01.entity.book.Book;
import com.jy.boot01.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("book/toList.do")
    String toBookListPage() {
        return "book/list";
    }

    @RequestMapping("book/toAdd.do")
    String toBookAddPage() {
        return "book/add";
    }

    @RequestMapping("book/list")
    @ResponseBody
    Map<String, Object> selectBookList(Book book) {
        Map<String, Object> map = bookService.selectBookList(book);
        return map;
    }

    @RequestMapping("book/insert.do")
    @ResponseBody
    String insertBook(Book book) {
        bookService.insertBook(book);
        return "{}";
    }

    @RequestMapping("book/delete.do")
    @ResponseBody
    String deleteShopByID(Book book) {
        bookService.deleteBookByID(book);
        return "{}";
    }

    @RequestMapping("book/toEdit")
    String toBookEditPage(Book book, ModelMap mm) {
        Book b = bookService.selectBookInfoByID(book);
        mm.addAttribute("book", b);
        return "book/edit";
    }

    @RequestMapping("book/update.do")
    @ResponseBody
    String updateShopByID(Book book) {
        bookService.updateBookByID(book);
        return "{}";
    }

    @RequestMapping("book/edit")
    @ResponseBody
    String updateBookInfoByID(Book book) {
        bookService.updateBookInfoByID(book);
        return "{}";
    }

}
