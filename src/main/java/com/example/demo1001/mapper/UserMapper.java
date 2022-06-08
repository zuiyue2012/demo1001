package com.example.demo1001.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo1001.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 李先生
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-06-08 21:12:54
* @Entity com.example.demo1001.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {


}
