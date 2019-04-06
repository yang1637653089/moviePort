package cn.bdqn.moviePort.pojo;

import java.io.Serializable;

/**
 * 影片所属地区
 */
public class District implements Serializable {
    private Integer id;
    private String name;

    public District() { }
    public District(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
