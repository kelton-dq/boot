package admin.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @fileName: Employee
 * @description:
 * @author: Kelton
 * @create: 2022-06-20 15:54
 **/
@Data
@TableName("tbl_emp")
public class Employee {
    @TableId
    private Integer empId;
    private String empName;
    private String gender;
    private String email;
    private Integer dId;
}
