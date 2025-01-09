package top.hyperplasma;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement    //开启注解方式的事务管理
@EnableCaching
@Slf4j
public class HyplusFoodieApplication {
    public static void main(String[] args) {
        SpringApplication.run(HyplusFoodieApplication.class, args);
        log.info("server started");
    }
}
