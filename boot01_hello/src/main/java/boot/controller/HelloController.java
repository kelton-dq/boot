package boot.controller;

import boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @fileName: HelloController
 * @description:
 * @author: Kelton
 * @create: 2022-06-10 10:35
 **/
//@ResponseBody
//@Controller
@Slf4j
@RestController
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String hello() {
        log.info("info……");
        return "Hello SpringBoot2";
    }
    
    @RequestMapping("/person")
    public String person() {
        
        return person.toString();
    }
}
