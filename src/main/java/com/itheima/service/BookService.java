package com.itheima.service;

import com.itheima.bean.Book;

import java.util.List;

public interface BookService {
    List<Book> findall();

    int add(Book book);

    int update(Book book);

    int delete(Book book);
}
