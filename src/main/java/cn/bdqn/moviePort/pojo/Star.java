package cn.bdqn.moviePort.pojo;

import java.io.Serializable;

/**
 * 主演
 */
public class Star implements Serializable {
    private Integer id;
    private String name;
    private Integer sex;
    private String imgPath;

    public Star() { }
    public Star(Integer id, String name, Integer sex, String imgPath) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.imgPath = imgPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "Star{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }
}
