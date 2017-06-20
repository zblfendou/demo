package com.study.services.user;

import com.study.commons.test.AbstractSpringTestRunner;
import com.study.models.user.User;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.inject.Inject;

/**
 * Created by zbl on 2017/6/20.
 */

public class UserServiceTest extends AbstractSpringTestRunner{
    @Inject
    private UserService userService;

    @Test
    public void add() {
        User user = new User();
        user.setName("test");
        user.setPassword("password");
        userService.add(user);
        outputJson(user);
    }

}
