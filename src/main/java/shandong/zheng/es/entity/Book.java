package shandong.zheng.es.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangzheng74@jd.com
 * @since 2025/3/21 17:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "books", createIndex = true)
public class Book implements Serializable {

    @Id
    private Long id;

    @Field(name = "code", type = FieldType.Keyword)
    private String code;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "ts", type = FieldType.Date)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date ts;

}
