package cn.bdqn.moviePort.service;


import cn.bdqn.moviePort.pojo.User;

public interface IUserService {
    /**
     * 根据部分user信息获取全user信息
     * @param user 部分user信息((userName、phone、email)(三选一)、pwd(必填))
     * @return user对象结果
     */
    User getUserWithUser(User user);

    User getUserWithPhone(String phone);
    int addUserWithUser(User user);
}
