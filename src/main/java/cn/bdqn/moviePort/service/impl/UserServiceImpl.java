package cn.bdqn.moviePort.service.impl;

import cn.bdqn.moviePort.dao.UserMapper;
import cn.bdqn.moviePort.pojo.User;
import cn.bdqn.moviePort.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private final UserMapper userMapper;
    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserWithUser(User user) {
        return userMapper.selectUserWithUser(user);
    }

    @Override
    public User getUserWithPhone(String phone) {
        if("".equals(phone) || phone==null)return null;
        return userMapper.selectUserWithPhone(phone);
    }
}
