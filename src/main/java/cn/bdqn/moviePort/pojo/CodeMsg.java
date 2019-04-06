package cn.bdqn.moviePort.pojo;

import java.util.Map;

public class CodeMsg {
    private int code;
    private String message;
    private Map<String,Object> errorMap;

    public static CodeMsg SUCCESS= new CodeMsg(0,"SUCCESS");
    public static CodeMsg SERVER_EXCEPTION = new CodeMsg(500100,"服务端异常");
    public static CodeMsg PARAMETER_ISNULL = new CodeMsg(500101,"输入参数为空");
    public static CodeMsg USER_NOT_EXIST = new CodeMsg(500102,"用户不存在");
    public static CodeMsg SESSION_NOT_EXSIST =  new CodeMsg(500104,"不存在离线session数据");
    public static CodeMsg NOT_FIND_DATA = new CodeMsg(500105,"查找不到对应数据");
    public static CodeMsg ERROE = new CodeMsg(500107,"结果集封装错误");
    public static CodeMsg TEL_ERROR = new CodeMsg(500108,"手机号或者验证码错误");
    public static CodeMsg REGISTER_ERROR = new CodeMsg(500109,"注册失败");

    private CodeMsg(int code, String message) {
        this.code = code;
        this.message = message;
    }
    public CodeMsg(int code, Map<String,Object> errorMap) {
        this.code = code;
        this.errorMap = errorMap;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getErrorMap() {
        return errorMap;
    }

    public void setErrorMap(Map<String, Object> errorMap) {
        this.errorMap = errorMap;
    }
}

