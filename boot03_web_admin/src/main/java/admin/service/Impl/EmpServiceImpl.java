package admin.service.Impl;

import admin.bean.Employee;
import admin.mapper.EmpMapper;
import admin.service.EmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @fileName: EmpServiceImpl
 * @description:
 * @author: Kelton
 * @create: 2022-06-21 11:41
 **/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Employee> implements EmpService {
}
