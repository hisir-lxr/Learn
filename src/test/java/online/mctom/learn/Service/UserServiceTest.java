package online.mctom.learn.Service;

import online.mctom.learn.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import online.mctom.learn.entity.User;

import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/9/2023 6:42 AM
 * @description
 */

@SpringBootTest
public class UserServiceTest {
   @Autowired
   private UserService userService;

   @Test
   public void testRegister() throws Exception {
      User user = new User();
      user.setUserAccount("test");
      user.setUserPwd("123456");
      Map<String, Object> map = userService.register(user);
      System.out.println(map);
   }
}
