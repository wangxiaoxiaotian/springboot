package com.example.demomybatisplus.service.impl;

import com.example.demomybatisplus.entity.User;
import com.example.demomybatisplus.mapper.UserMapper;
import com.example.demomybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王小甜
 * @since 2020-06-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
