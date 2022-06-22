package boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.PrimitiveIterator;

/**
 * @fileName: Person
 * @description:
 * @author: Kelton
 * @create: 2022-06-14 22:09
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String userName;
    private Integer age;
    private Date birth;
    private String gender;
}
