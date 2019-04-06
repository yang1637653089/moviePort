package cn.bdqn.moviePort.pojo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 */
public class User implements Serializable {
    private Integer id;
    private String imgPath;
    @NotNull
    @Length(min = 6,max = 11,message = "您的用户名只能在6~11位之间")
    private String userName;
    @NotNull
    @Length(min = 11,max = 11,message = "手机号格式不正确")
    private String phone;
    private String email;
    @NotNull
    @Length(min = 6,max = 8,message = "密码需要在6~8位")
    private String pwd;
    private Date createDate;


    public User() { }
    public User(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }
    public User(Integer id, String imgPath, String userName, String phone, String email, String pwd, Date createDate) {
        this.id = id;
        this.imgPath = imgPath;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.pwd = pwd;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", imgPath='" + imgPath + '\'' +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
