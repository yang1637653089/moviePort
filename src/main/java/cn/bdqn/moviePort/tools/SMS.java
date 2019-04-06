package cn.bdqn.moviePort.tools;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;

import java.io.IOException;

public class SMS {
    private static int appId;
    private static String appKey;
    private static int templateId;
    private static String nationCode;
    private static String smsSign="楊admin";

    static {
        init();
    }
    private static void init(){
        ConfigManager fig=ConfigManager.getInstance("toolsProperties/SMSConfig.properties");
        appId= Integer.parseInt(fig.getProperty("appId"));
        appKey= fig.getProperty("appKey");
        templateId= Integer.parseInt(fig.getProperty("templateId"));
        nationCode= fig.getProperty("nationCode");
    }
    public static SmsSingleSenderResult sentTo(String phoneTel,String verifyCode){
        SmsSingleSender ssender=new SmsSingleSender(appId,appKey);
        try {
            return ssender.sendWithParam(
                    nationCode,
                    phoneTel,
                    templateId,
                    new String[]{verifyCode},
                    smsSign,
                    "",
                    ""
            );
        } catch (HTTPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
