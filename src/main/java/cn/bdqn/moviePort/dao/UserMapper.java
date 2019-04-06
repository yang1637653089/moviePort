package cn.bdqn.moviePort.dao;

import cn.bdqn.moviePort.pojo.User;

public interface UserMapper {
    User selectUserWithUser(User user);
    User selectUserWithPhone(String phone);
}