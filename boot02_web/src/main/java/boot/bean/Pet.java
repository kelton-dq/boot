package boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @fileName: Pet
 * @description:
 * @author: Kelton
 * @create: 2022-06-14 21:39
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private String name;
    private Integer age;
}
