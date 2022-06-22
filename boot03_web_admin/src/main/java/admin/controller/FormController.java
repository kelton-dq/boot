package admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @fileName: FormController
 * @description:
 * @author: Kelton
 * @create: 2022-06-18 13:03
 **/
@Slf4j
@Controller
public class FormController {
    @RequestMapping("/form_layouts")
    public String form_layouts() {

        return "form/form_layouts";
    }

    /**
     * 接受文件上传
     * @param email
     * @param password
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("password") String password,
                         @RequestParam("file")MultipartFile file) {
        log.info("email={}, password={}, file={}",email, password, file.getSize());
        return "index";
    }
}
