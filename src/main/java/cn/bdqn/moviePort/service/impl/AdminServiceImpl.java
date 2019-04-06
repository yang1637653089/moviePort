package cn.bdqn.moviePort.service.impl;

import cn.bdqn.moviePort.dao.AdminMapper;
import cn.bdqn.moviePort.pojo.Admin;
import cn.bdqn.moviePort.service.IAdminService;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements IAdminService {
    private AdminMapper adminMapper;

    public AdminServiceImpl(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public Admin getAdminByUserAndPwd(String user, String pwd) {
        return adminMapper.selectAdminByUserAndPwd(user, pwd);
    }
}
