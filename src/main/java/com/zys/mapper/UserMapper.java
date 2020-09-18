package com.zys.mapper;

import com.zys.pojo.User;

import java.util.List;

/**
 * @program: SSM-xml
 * @description:
 * @author: xiaozhang6666
 * @create: 2020-09-14 23:01
 **/
public interface UserMapper {
    List<User> findAll();
    Integer  saveUser(User user);
}
