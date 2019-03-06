package com.ljf.springboot.mybaits.demos.services;

import com.github.pagehelper.PageInfo;
import com.ljf.springboot.mybaits.demos.model.UserDomain;

public interface UserService {
    public int addUser(UserDomain ud);

    public PageInfo<UserDomain> queryAllUser(int pageNum, int pageSize);
}
