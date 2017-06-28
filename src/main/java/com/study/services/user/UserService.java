package com.study.services.user;

import com.study.models.user.User;

/**
 * Created by zbl on 2017/6/20.
 */
public interface UserService {
    void save(User user);

    User findOneByName(String name);
}
