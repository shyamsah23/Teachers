package com.example.Teachers.Service;

import com.example.Teachers.Mapper.AuthMapper;
import com.example.Teachers.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthMapper authMapper;

    public int saveUser(User user)
    {
       return authMapper.saveUser(user);
    }

    public User findUserByUserName(String username)
    {
        return authMapper.findUserByUserName(username);
    }
}
