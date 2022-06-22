package admin.controller;

import admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @fileName: IndexController
 * @description:
 * @author: Kelton
 * @create: 2022-06-16 20:30
 **/
@Controller
public class IndexController {
    /**
     * 登录页
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage() {
        return "login";
    }

    /**
     * 登录操作，重定向解决刷新问题
     * @param user
     * @param session
     * @param model
     * @return
     */
    @PostMapping("/login")
    public String index(User user, HttpSession session, Model model) {
        if(StringUtils.hasText(user.getUserName()) && "123".equals(user.getPassword())){
            session.setAttribute("loginUser", user);
        }else {
            model.addAttribute("msg", "账号密码错误");
            return "login";
        }
        return "redirect:/index.html";
    }

    /**
     * 打开首页
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/index.html")
    public String indexPage(HttpSession session, Model model) {
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return "index";
        }else {
            model.addAttribute("msg", "当前未登录");
            return "login";
        }
    }
}
