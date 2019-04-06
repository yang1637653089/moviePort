package cn.bdqn.moviePort.pojo;

import java.io.Serializable;

/**
 * 评论
 */
public class Comment implements Serializable {
    private Integer id;
    private User user;
    private Movie movie;
    private String content;
    private Integer popularity;

    public Comment() { }
    public Comment(Integer id, User user, Movie movie, String content, Integer popularity) {
        this.id = id;
        this.user = user;
        this.movie = movie;
        this.content = content;
        this.popularity = popularity;
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

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", user=" + user +
                ", movie=" + movie +
                ", content='" + content + '\'' +
                ", popularity=" + popularity +
                '}';
    }
}
