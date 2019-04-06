package cn.bdqn.moviePort.dao;

import cn.bdqn.moviePort.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    Admin selectAdminByUserAndPwd(@Param("user")String user,@Param("pwd")String pwd);
}
