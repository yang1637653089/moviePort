package cn.bdqn.moviePort.pojo;

import java.io.Serializable;

/**
 * 管理员
 */
public class Admin implements Serializable {
    private Integer id;
    private String user;
    private String pwd;

    public Admin() { }
    public Admin(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }
    public Admin(Integer id, String user, String pwd) {
        this.id = id;
        this.user = user;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
