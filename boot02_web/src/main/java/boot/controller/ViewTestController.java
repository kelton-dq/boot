package boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @fileName: ViewTestController
 * @description:
 * @author: Kelton
 * @create: 2022-06-16 18:06
 **/
@Controller
public class ViewTestController {

    @RequestMapping("/success")
    public String success(Model model) {
        model.addAttribute("msg","成功！");
        return "success";
    }
}
