package ahn.loa.loacanbu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ahn.loa.loacanbu")
@MapperScan(basePackages = {"ahn.loa.loacanbu"})
public class LoaCanbuApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoaCanbuApplication.class, args);
    }

}
