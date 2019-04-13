package cn.bdqn.moviePort.service.impl;

import cn.bdqn.moviePort.dao.UserMapper;
import cn.bdqn.moviePort.pojo.User;
import cn.bdqn.moviePort.service.IUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    private final UserMapper userMapper;
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserWithUser(User user) {
        return userMapper.selectUserWithUser(user);
    }

    @Override
    public User getUserWithPhone(String phone) {
        return userMapper.selectUserWithPhone(phone);
    }

    @Override
    public int addUserWithUser(User user) {
        return userMapper.insertUserWithUser(user);
    }

    @Override
    public PageInfo<User> getAllUser(int page, int limit) {
        PageInfo<User> thisPage=new PageInfo<>();
        int begin=(page*limit)-limit;
        List<User> users = userMapper.selectAllUser(begin, limit);
        int count = userMapper.selectCount();
        thisPage.setList(users);
        thisPage.setTotal(count);
        return thisPage;
    }

    @Override
    public int getCount() {
        return userMapper.selectCount();
    }

    @Override
    public int delUserWithId(int id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int changeUserWithObject(User user) {
        return userMapper.updateUserWithObject(user);
    }
}
