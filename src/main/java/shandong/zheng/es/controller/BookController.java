package shandong.zheng.es.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shandong.zheng.es.entity.Book;
import shandong.zheng.es.service.BookService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author zhangzheng74@jd.com
 * @since 2025/3/21 17:37
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookService bookService;

    @PostMapping("/add")
    public Book add(@RequestBody Book book) {
        book.setTs(new Date());
        return bookService.saveBook(book);
    }

    @PostMapping("/get")
    public List<Book> get(String code) {
        return bookService.findByCode(code);
    }

}
