package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * @fileName: MainApplication
 * @description:
 * @author: Kelton
 * @create: 2022-06-10 10:32
 **/
//主程序类
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MainApplication.class, args);
//        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
