package cn.bdqn.moviePort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pre/page")
public class PrePageController {

    @RequestMapping(path = "/doHelp")
    public String doHelp(){
        return "pre/help";
    }
    @RequestMapping(path = "/doIndex")
    public String doIndex(){
        return "pre/index";
    }
    @RequestMapping(path = "/doInfo")
    public String doInfo(){
        return "pre/info";
    }
    @RequestMapping(path = "/doLogin")
    public String doLogin(){
        return "pre/login";
    }
    @RequestMapping(path = "/doMovieFirst")
    public String doMovieFirst(){
        return "pre/movie_first";
    }
    @RequestMapping(path = "/doPersonal")
    public String doPersonal(){
        return "pre/personal";
    }
    @RequestMapping(path = "/doRegister")
    public String doRegister(){
        return "pre/register";
    }
}