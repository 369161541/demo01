package com.itheima.service.impl;

import com.itheima.bean.Book;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class BookServiceimpl implements BookService {
    @Autowired
    private BookDao bookdao;
    @Override
    public List<Book> findall() {
        List<Book> list = bookdao.findall();
        return  list;
    }

    @Override
    public int add(Book book) {
        int row = bookdao.add(book);
        return row;
    }

    @Override
    public int update(Book book) {
        int row = bookdao.update(book);
        return row;
    }

    @Override
    public int delete(Book book) {
        int row = bookdao.delete(book);
        return row;
    }
}
