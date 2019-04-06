package cn.bdqn.moviePort.tools;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager propertiesUtil=null;
    private Properties properties=null;
    private static Logger logger= Logger.getLogger(ConfigManager.class);

    private ConfigManager(String propertiesPath){
        initProperties(propertiesPath);
    }
    private void initProperties(String propertiesPath){
        properties=new Properties();
        InputStream is= ConfigManager.class.getClassLoader().getResourceAsStream(propertiesPath);
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("加载连接信息错误");
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                logger.error("流对象关闭错误");
                e.printStackTrace();
            }
        }
    }

    public static ConfigManager getInstance(String propertiesPath){
        if(propertiesUtil==null){
            propertiesUtil=new ConfigManager(propertiesPath);
        }
        return propertiesUtil;
    }
    public String getProperty(String property){
        return properties.getProperty(property);
    }
}
