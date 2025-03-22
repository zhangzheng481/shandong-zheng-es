package shandong.zheng.es.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import shandong.zheng.es.entity.Book;

import java.util.List;

/**
 * @author zhangzheng74@jd.com
 * @since 2025/3/21 17:43
 */
public interface BookDao extends ElasticsearchRepository<Book,Long> {

    List<Book> findByCode(String code);

    List<Book> findByName(String name);


}
