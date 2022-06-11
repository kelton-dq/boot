package boot.config;

import boot.bean.Pet;
import boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @fileName: MyConfig
 * @description:
 * @author: Kelton
 * @create: 2022-06-10 14:17
 **/
@Configuration
public class MyConfig {
    @ConditionalOnBean(name = "tom")
    @Bean//默认方法名为组件id
    public User user01(){
        return new User("zhangsan", 19);
    }
    @Bean
    public Pet tom(){
        return new Pet("tom", 23.4);
    }

}