package cn.bdqn.moviePort.controller;

import cn.bdqn.moviePort.pojo.CodeMsg;
import cn.bdqn.moviePort.pojo.Movie;
import cn.bdqn.moviePort.pojo.Result;
import cn.bdqn.moviePort.service.IMovieService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.omg.IOP.Codec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/movie")
public class MovieController {
    private final IMovieService movieService;
    @Autowired
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("/hotMovie")
    @ResponseBody
    public String hotMovie(){
        Result result;
        List<Movie> hotMovie = movieService.getHotMovie();
        if(hotMovie==null)result=Result.error(CodeMsg.NOT_FIND_DATA);
        else result=Result.success(hotMovie);
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }
}