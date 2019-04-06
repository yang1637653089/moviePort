package cn.bdqn.moviePort.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 */
public class Order implements Serializable {
    private Integer id;
    private User user;
    private Hall hall;
    private Integer seatNumber;
    private Date createDateTime;
    private Integer state;

    public Order() { }

    public Order(Integer id, User user, Hall hall, Integer seatNumber, Date createDateTime, Integer state) {
        this.id = id;
        this.user = user;
        this.hall = hall;
        this.seatNumber = seatNumber;
        this.createDateTime = createDateTime;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", hall=" + hall +
                ", seatNumber=" + seatNumber +
                ", createDateTime=" + createDateTime +
                ", state=" + state +
                '}';
    }
}
