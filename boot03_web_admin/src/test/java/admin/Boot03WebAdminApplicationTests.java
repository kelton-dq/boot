package admin;

import admin.bean.Employee;
import admin.mapper.EmpMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class Boot03WebAdminApplicationTests {

    @Autowired
    EmpMapper empMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testEmpMapper(){
        Employee employee = empMapper.selectById(5L);
        log.info("员工:{}",employee);
    }

}
