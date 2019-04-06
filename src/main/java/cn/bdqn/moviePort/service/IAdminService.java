package cn.bdqn.moviePort.service;

import cn.bdqn.moviePort.pojo.Admin;

public interface IAdminService {
    /**
     * 查询管理员信息
     * @param user 账号
     * @param pwd 密码
     * @return 匹配的查询结果对象ADMIN
     */
    Admin getAdminByUserAndPwd(String user,String pwd);
}