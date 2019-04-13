package cn.bdqn.moviePort.dao;

import cn.bdqn.moviePort.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User selectUserWithUser(User user);
    User selectUserWithPhone(String phone);
    int insertUserWithUser(User user);
    List<User> selectAllUser(@Param("begin") int begin,@Param("end") int end);
    int selectCount();
    int deleteUserById(int id);

    int updateUserWithObject(User user);
}