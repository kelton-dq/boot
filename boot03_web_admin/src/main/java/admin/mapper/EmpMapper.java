package admin.mapper;

import admin.bean.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * @fileName: EmpMapper
 * @description:
 * @author: Kelton
 * @create: 2022-06-20 15:54
 **/
@Mapper
public interface EmpMapper extends BaseMapper<Employee> {
//    Employee getEmp(Integer id);
//
//    @Insert("insert into user(`name`) values(#{name})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
//    public void saveEmp(Employee employee);
}
