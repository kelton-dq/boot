package admin.controller;

import admin.bean.Employee;
import admin.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @fileName: DataController
 * @description:
 * @author: Kelton
 * @create: 2022-06-20 16:04
 **/
@Controller
public class DataController {

    @Autowired
    EmpService empService;

/*    @ResponseBody
    @GetMapping("/emp/{id}")
    public Employee emp(@PathVariable("id") Integer id) {
        Employee employee = empService.getEmpById(id);
        return employee;
    }*/
}
