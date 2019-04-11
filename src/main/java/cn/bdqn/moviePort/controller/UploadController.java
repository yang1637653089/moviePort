package cn.bdqn.moviePort.controller;

import cn.bdqn.moviePort.pojo.Result;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/upload")
public class UploadController {
    @PostMapping("/userPhoto")
    @ResponseBody
    public String userPhoto(){
        Map<String,String> resultMap =new HashMap<>();
        resultMap.put("src", "23131");
        Result result=Result.success(resultMap);
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }
}
