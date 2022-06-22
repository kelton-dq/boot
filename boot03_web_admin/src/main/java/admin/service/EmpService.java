package admin.service;

import admin.bean.Employee;
import admin.mapper.EmpMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @fileName: EmpService
 * @description:
 * @author: Kelton
 * @create: 2022-06-20 16:06
 **/
public interface EmpService extends IService<Employee> {


/*    public Employee getEmpById(Integer id){
        return empMapper.getEmp(id);
    }*/
}
