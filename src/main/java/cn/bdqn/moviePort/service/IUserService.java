package cn.bdqn.moviePort.service;


import cn.bdqn.moviePort.pojo.User;
import com.github.pagehelper.PageInfo;

public interface IUserService {
    /**
     * 根据部分user信息获取全user信息
     * @param user 部分user信息((userName、phone、email)(三选一)、pwd(必填))
     * @return user对象结果
     */
    User getUserWithUser(User user);

    /**
     * 通过手机号get会员对象
     * @param phone 会员手机号码
     * @return 通过手机号get到的会员对象
     */
    User getUserWithPhone(String phone);

    /**
     * 添加一个user
     * @param user 会员对象
     * @return 受影响的行数
     */
    int addUserWithUser(User user);

    /**
     * 分页获取会员类型的集合
     * @param page 当前页码
     * @param limit 每页数量
     * @return 会员类型的集合
     */
    PageInfo<User> getAllUser(int page, int limit);

    /**
     * 获取会员的总数量
     * @return 会员的总数量
     */
    int getCount();

    /**
     * 根据id删除会员
     * @param id 唯一标识的id
     * @return 受影响的行数
     */
    int delUserWithId(int id);

    int changeUserWithObject(User user);
}
