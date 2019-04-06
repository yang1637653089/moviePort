package cn.bdqn.moviePort.pojo;

import java.io.Serializable;

/**
 * 影院
 */
public class Cinema implements Serializable {
    private Integer id;
    private String cinemaName;
    private Province province;
    private String address;

    public Cinema() { }
    public Cinema(Integer id, String cinemaName, Province province, String address) {
        this.id = id;
        this.cinemaName = cinemaName;
        this.province = province;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", cinemaName='" + cinemaName + '\'' +
                ", province=" + province +
                ", address='" + address + '\'' +
                '}';
    }
}
