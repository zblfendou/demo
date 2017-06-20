package com.study.services.user.impl;

import com.study.models.user.User;
import com.study.repositories.UserRepository;
import com.study.services.user.UserService;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by zbl on 2017/6/20.
 */
@Named("userService")
public class UserServicesImpl implements UserService {
    @Inject
    private UserRepository userDao;

    @Override
    public void add(User user) {
        userDao.save(user);
    }
}
