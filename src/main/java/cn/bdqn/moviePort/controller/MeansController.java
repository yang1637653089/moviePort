package cn.bdqn.moviePort.controller;

import cn.bdqn.moviePort.tools.SMS;
import cn.bdqn.moviePort.tools.VerifyCode;
import com.alibaba.fastjson.JSONObject;
import com.github.qcloudsms.SmsSingleSenderResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/means")
public class MeansController {

    @RequestMapping(path = "/sendToSMS",method = RequestMethod.POST)
    public @ResponseBody String sendToSMS(@RequestParam("tel") String tel, HttpSession session){
        String verifyCode = VerifyCode.next();
        SmsSingleSenderResult result = SMS.sentTo(tel, verifyCode);
        if (result != null && result.result == 0) {
            session.setAttribute("tel", tel);
            session.setAttribute("verifyCode", verifyCode);
        }
        JSONObject jsonObject=new JSONObject();
        assert result != null;
        jsonObject.put("result",result.result);
        jsonObject.put("errMsg",result.errMsg);
        jsonObject.put("ext",result.ext);
        jsonObject.put("fee",result.fee);
        jsonObject.put("sid",result.sid);
        return jsonObject.toJSONString();
    }
}
