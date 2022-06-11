package boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @fileName: Pet
 * @description:
 * @author: Kelton
 * @create: 2022-06-10 14:14
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private String name;
    private Double weight;
}
