package com.ljf.springboot.mybaits.demos.dao;

import com.ljf.springboot.mybaits.demos.model.UserDomain;

import java.util.List;

public interface UserDao {
    public int addUser(UserDomain ud);
    public List<UserDomain> queryUserList();
}
