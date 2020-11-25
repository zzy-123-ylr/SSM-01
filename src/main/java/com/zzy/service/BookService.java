package com.zzy.service;

import com.zzy.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookByID(@Param("bookId") int id);
    //查看所有的书
    List<Books> queryAllBook();
}
