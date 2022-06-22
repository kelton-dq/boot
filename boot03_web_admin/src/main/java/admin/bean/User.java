package admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @fileName: User
 * @description:
 * @author: Kelton
 * @create: 2022-06-16 20:54
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userName;
    private String password;
}
