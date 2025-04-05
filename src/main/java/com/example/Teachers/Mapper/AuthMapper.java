package com.example.Teachers.Mapper;

import com.example.Teachers.Model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthMapper {
    int saveUser(User user);
    User findUserByUserName(String name);
}
