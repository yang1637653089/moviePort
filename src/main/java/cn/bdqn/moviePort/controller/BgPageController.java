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
    @RequestMapping(path = "/doMember-list")
    public String doMemberlist(){
        return "bg/member-list";
    }
    @RequestMapping(path = "/doMember-list1")
    public String doMemberlist1(){
        return "bg/member-list1";
    }
    @RequestMapping(path = "/doMember-del")
    public String doMemberDel(){
        return "bg/member-del";
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
    @RequestMapping(path = "/doAdmin-List")
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
}
