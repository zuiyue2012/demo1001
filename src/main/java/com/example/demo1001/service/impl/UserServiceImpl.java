package com.example.demo1001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo1001.domain.User;
import com.example.demo1001.mapper.UserMapper;
import com.example.demo1001.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 李先生
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-06-08 21:12:54
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
