//package shandong.zheng.es.config;
//
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//
///**
// * es配置类
// * @author zhangzheng74@jd.com
// * @since 2025/3/21 16:57
// */
//@Configurable
//public class EsConfig {
//
//    @Value("${spring.elasticsearch.host}")
//    private String host;
//
//    @Value("${spring.elasticsearch.port}")
//    private  int port;
//
//    @Bean
//    public RestHighLevelClient client() {
//        return new RestHighLevelClient(
//                RestClient.builder(new HttpHost(host, port, "http"))
//        );
//    }
//}
