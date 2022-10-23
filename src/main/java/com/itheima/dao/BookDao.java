package com.itheima.dao;

import com.itheima.bean.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {
    @Select("SELECT * FROM tbl_book")
    List<Book> findall();

    @Insert("INSERT INTO tbl_book VALUES (null, #{type},#{name},#{description})")
    int add(Book book);

     @Update("UPDATE tbl_book SET type = #{type}, name = #{name},description = #{description} where id = #{id}")
    int update(Book book);

     @Delete("DELETE FROM tbl_book WHERE id=#{id}")
     int delete(Book book);
}
