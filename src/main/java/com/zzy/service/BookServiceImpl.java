package com.zzy.service;

import com.zzy.dao.BookMapper;
import com.zzy.pojo.Books;
import com.zzy.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    //service层调用dao层：组合dao
    @Resource
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookByID(int id) {
        return bookMapper.queryBookByID(id);
    }

    @Override
    public List<Books> queryAllBook() {

        System.out.println("BookService");
        return bookMapper.queryAllBook();
    }


}
