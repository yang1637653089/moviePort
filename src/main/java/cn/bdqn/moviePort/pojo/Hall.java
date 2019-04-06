package cn.bdqn.moviePort.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *影厅
 */
public class Hall implements Serializable {
    private Integer id;
    private Cinema cinema;
    private Movie movie;
    private Integer totalCount;
    private Integer surplusCount;
    private Date beginTime;
    private Date endTime;

    public Hall() { }
    public Hall(Integer id, Cinema cinema, Movie movie, Integer totalCount, Integer surplusCount, Date beginTime, Date endTime) {
        this.id = id;
        this.cinema = cinema;
        this.movie = movie;
        this.totalCount = totalCount;
        this.surplusCount = surplusCount;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getSurplusCount() {
        return surplusCount;
    }

    public void setSurplusCount(Integer surplusCount) {
        this.surplusCount = surplusCount;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", cinema=" + cinema +
                ", movie=" + movie +
                ", totalCount=" + totalCount +
                ", surplusCount=" + surplusCount +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }
}