package cn.bdqn.moviePort.pojo;

import java.io.Serializable;

/**
 * 影片类型所属
 */
public class Genre implements Serializable {
    private Integer id;
    private String typeName;

    public Genre() { }
    public Genre(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
