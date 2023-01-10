package com.szc.service.impl;

import com.szc.entity.User;
import com.szc.mapper.UserMapper;
import com.szc.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 嘉兴学院：沈智超
 * @since 2021-11-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
