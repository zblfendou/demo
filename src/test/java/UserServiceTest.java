import com.study.SpringBootApplication;
import com.study.models.user.User;
import com.study.services.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.inject.Inject;

/**
 * Created by zbl on 2017/8/21.
 */
public class UserServiceTest extends AbstractTest{
    @Inject
    private UserService userService;

    @Test
    public void addUser() {
        User user = new User();
        user.setPassword("add User Password");
        user.setName("add User name");
        userService.save(user);
    }
}
