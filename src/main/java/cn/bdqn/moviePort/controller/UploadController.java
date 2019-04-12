package cn.bdqn.moviePort.controller;

import cn.bdqn.moviePort.pojo.CodeMsg;
import cn.bdqn.moviePort.pojo.Result;
import cn.bdqn.moviePort.tools.PhotoPath;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/upload")
public class UploadController {
    @PostMapping("/userPhoto")
    @ResponseBody
    public String userPhoto(MultipartFile userPhoto, HttpServletRequest request){
        File file = PhotoPath.generateFile(userPhoto.getOriginalFilename(), request);
        Map<String,String> resultMap =new HashMap<>();
        resultMap.put("src", file.getName());
        Result result=Result.success(resultMap);
        try {
            userPhoto.transferTo(file);
        } catch (IOException e) {
            result=Result.error(CodeMsg.FILE_UP_ERROR);
        }
        return JSON.toJSONStringWithDateFormat(result,"yyyy-MM-dd",
                SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue);
    }
}