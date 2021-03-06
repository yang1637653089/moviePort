package cn.bdqn.moviePort.controller;

import cn.bdqn.moviePort.pojo.CodeMsg;
import cn.bdqn.moviePort.pojo.Result;
import cn.bdqn.moviePort.pojo.User;
import cn.bdqn.moviePort.service.IUserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/pre/user")
public class UserController {
    private final IUserService userService;
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(User user, HttpSession session){
        Result result;
        user= userService.getUserWithUser(user);
        session.setAttribute("user",user);
        if(user==null)result=Result.error(CodeMsg.NOT_FIND_DATA);
        else result=Result.success();
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }

    @RequestMapping("/login/{phone}/{verifyCode}")
    @ResponseBody
    public String loginWithPhone(@PathVariable String phone,@PathVariable String verifyCode, HttpSession session){
        User user;
        Result result;
        if(phone.equals(session.getAttribute("tel")) && verifyCode.equals(session.getAttribute("verifyCode"))){
            user=userService.getUserWithPhone(phone);
            session.setAttribute("user",user);
            session.removeAttribute("tel");
            session.removeAttribute("verifyCode");
            if(user==null) result=Result.error(CodeMsg.NOT_FIND_DATA);
            else result=Result.success(user);
        }else result=Result.error(CodeMsg.TEL_ERROR);
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }
    @PostMapping("/register")
    @ResponseBody
    public String register(@Valid User user, BindingResult bindingResult,String verifyCode,HttpSession session){
        Result result;
        if(bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            Map<String,Object> errorMap=new HashMap<>();
            for (FieldError error: errors) {
                errorMap.put(error.getField(),error.getDefaultMessage());
            }
            result=Result.errors(new CodeMsg(500106,errorMap));
        }else {
            if(user.getPhone().equals(session.getAttribute("tel")) && verifyCode.equals(session.getAttribute("verifyCode"))){
                int row = userService.addUserWithUser(user);
                session.removeAttribute("tel");
                session.removeAttribute("verifyCode");
                //判断执行结果
                if(row==1)result=Result.success(row);
                else result=Result.error(CodeMsg.REGISTER_ERROR);
            }else result=Result.error(CodeMsg.TEL_ERROR);
        }
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }
    @GetMapping("/list")
    @ResponseBody
    public String list(int page,int limit){
        PageInfo<User> users = userService.getAllUser(page, limit);
        Result result=Result.success(users);
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }
    @PostMapping("/del")
    @ResponseBody
    public String userList(Integer id){
        Result result=Result.error(CodeMsg.MISSING_PARAMETERS);
        if(id!=null){
            int row=userService.delUserWithId(id);
            result=Result.success(row);
        }
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }
    @PostMapping("/change")
    @ResponseBody
    public String change(User user){
        int row=userService.changeUserWithObject(user);
        Result result=Result.success(row);
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }
}