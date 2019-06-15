package com.rjb.mapper;

import com.rjb.pojo.Users;

import java.util.List;

/**
 * @Auther: rjb
 * @Date: 2019/6/14
 * @Description: com.rjb.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
