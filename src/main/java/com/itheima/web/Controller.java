package com.itheima.web;

import com.itheima.bean.Book;
import com.itheima.bean.R;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Retention;
import java.util.List;
import java.util.concurrent.RecursiveTask;

@RestController
public class Controller {
    @Autowired
    private BookService bookservice;

    @GetMapping("/books")
    public R findall() {
        List<Book> list = bookservice.findall();
        if(list!=null){
            return new R(1, list, "查询成功");
        }

        else return new R(0,null,"查询失败");

    }
    @PostMapping("/books")
    public R add(@RequestBody Book book){
        int row = bookservice.add(book);
        if (row>0){
            return new R(1,null,"添加成功");
        }
        else return new R(0,null,"添加失败");
    }
    @PutMapping("/books")
    public R update(@RequestBody Book book){
        int row = bookservice.update(book);
        if (row>0){
            return new R(1,null,"更新成功");
        }
        else return new R(0,null,"更新失败");
    }
    @PutMapping("/delbooks")
    public R delete(@RequestBody Book book){
        int row = bookservice.delete(book);
        if (row>0){
            return new R(1,null,"删除成功");
        }
        else return new R(0,null,"删除失败");
    }
}
