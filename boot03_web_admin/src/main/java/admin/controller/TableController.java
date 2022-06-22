package admin.controller;

import admin.bean.Employee;
import admin.bean.User;
import admin.service.EmpService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

/**
 * @fileName: TableController
 * @description:
 * @author: Kelton
 * @create: 2022-06-16 21:26
 **/
@Controller
public class TableController {
    @Autowired
    EmpService empService;

    @GetMapping("/basic_table")
    public String basic_table() {
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model, @RequestParam(value = "pn", defaultValue = "1")Integer pn){
        //表格内容的遍历
        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
                new User("lisi", "123444"),
                new User("haha", "aaaaa"),
                new User("hehe ", "aaddd"));
        model.addAttribute("users",users);

        List<Employee> list = empService.list();
        model.addAttribute("emps",list);

        Page<Employee> page = new Page<>(pn, 5);
        Page<Employee> employeePage = empService.page(page, null);
        model.addAttribute("page", employeePage);

        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }
}

