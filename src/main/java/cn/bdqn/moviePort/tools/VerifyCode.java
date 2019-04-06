package cn.bdqn.moviePort.tools;

public class VerifyCode {

    public static String next(){
        return Integer.toString((int) ((Math.random()*9+1)*1000));
    }
}
