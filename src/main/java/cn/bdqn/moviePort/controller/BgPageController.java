package cn.bdqn.moviePort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bg/page")
public class BgPageController {

    @RequestMapping(path = "/doLogin")
    public String doLogin(){
        return "bg/login";
    }
    @RequestMapping(path = "/doIndex")
    public String doIndex(){
        return "bg/index";
    }
    @RequestMapping(path = "/doUserList")
    public String doUserList(){
        return "bg/userList";
    }
    @RequestMapping(path = "/doOrder-list")
    public String doOrderList(){
        return "bg/order-list";
    }
    @RequestMapping(path = "/doCate")
    public String doCate(){
        return "bg/cate";
    }
    @RequestMapping(path = "/doCity")
    public String doCity(){
        return "bg/city";
    }
    @RequestMapping(path = "/doAdmin-edit")
    public String doAdminEdit(){
        return "bg/admin-edit";
    }
    @RequestMapping(path = "/doAdmin-list")
    public String doAdminList(){
        return "bg/admin-list";
    }
    @RequestMapping(path = "/doAdmin-role")
    public String doAdminRole(){
        return "bg/admin-role";
    }
    @RequestMapping(path = "/doAdmin-cate")
    public String doAdminCate(){
        return "bg/admin-cate";
    }
    @RequestMapping(path = "/doAdmin-rule")
    public String doAdminRule(){
        return "bg/admin-rule";
    }
    @RequestMapping(path = "/doUnicode")
    public String doUnicode(){
        return "bg/unicode";
    }
    @RequestMapping(path = "/doError")
    public String doError(){
        return "bg/error";
    }
    @RequestMapping(path = "/doWelcome")
    public String doWelcome(){
        return "bg/welcome";
    }


    @RequestMapping(path = "/doMemberEdit")
    public String doMemberEdit(){
        return "bg/member-edit";
    }

    @RequestMapping(path = "/doUserAdd")
    public String doUserAdd(){
        return "bg/userAdd";
    }


    @RequestMapping(path = "/doMemberPassword")
    public String doMemberPassword(){
        return "bg/member-password";
    }
}
