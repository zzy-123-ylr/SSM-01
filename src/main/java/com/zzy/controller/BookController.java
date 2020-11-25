package com.zzy.controller;

import com.zzy.pojo.Books;
import com.zzy.service.BookService;
import com.zzy.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/Book")
public class BookController {

    @Resource
    private BookServiceImpl bookService;

    //查询全部书籍并且返回一个页面
    @RequestMapping("/allbook")
    public String queryAllBook(HttpServletRequest request){
        System.out.println("你好");
        List<Books> books = bookService.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
        request.getSession().setAttribute("listbook",books);

        return "allBook";
    }

}
