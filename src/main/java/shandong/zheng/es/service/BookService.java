package shandong.zheng.es.service;

import org.springframework.stereotype.Service;
import shandong.zheng.es.dao.BookDao;
import shandong.zheng.es.entity.Book;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangzheng74@jd.com
 * @since 2025/3/21 17:45
 */
@Service
public class BookService {

    @Resource
    private BookDao bookDao;

    public Book saveBook(Book book) {
        return bookDao.save(book);
    }

    public List<Book> findByCode(String code) {
        return bookDao.findByCode(code);
    }

}
