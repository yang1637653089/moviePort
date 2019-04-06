package cn.bdqn.moviePort.controller;

import cn.bdqn.moviePort.pojo.Admin;
import cn.bdqn.moviePort.pojo.CodeMsg;
import cn.bdqn.moviePort.pojo.Result;
import cn.bdqn.moviePort.service.IAdminService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/bg/admin")
public class AdminController {
    private final IAdminService adminService;
    @Autowired
    public AdminController(IAdminService adminService) {
        this.adminService = adminService;
    }


    @RequestMapping(path = "/login",method = {RequestMethod.POST})
    @ResponseBody
    public String login(String user,String pwd, HttpSession session){
        Result result;
        Admin admin = adminService.getAdminByUserAndPwd(user, pwd);
        if(admin==null){
            result=Result.error(CodeMsg.USER_NOT_EXSIST);
        }else {
            session.setAttribute("admin",admin);
            result=Result.success(admin);
        }
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }

    @RequestMapping(path = "/getAdminName")
    @ResponseBody
    public String getAdminName(HttpSession session){
        Result result=Result.success(((Admin)(session.getAttribute("admin"))).getUser());

        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }
}
