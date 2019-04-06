package cn.bdqn.moviePort.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 影片信息
 */
public class Movie implements Serializable {
    private Integer id;
    private String name;
    private Star star;
    private String decoration;
    private Director director;
    private Double price;
    private Date showDateTime;
    private Integer popularity;
    private Genre genre;
    private District district;
    private String trailerPath;
    private String details;
    private Integer state;

    public Movie() { }
    public Movie(Integer id, String name, Star star, String decoration, Director director, Double price, Date showDateTime, Integer popularity, Genre genre, District district, String trailerPath, String details, Integer state) {
        this.id = id;
        this.name = name;
        this.star = star;
        this.decoration = decoration;
        this.director = director;
        this.price = price;
        this.showDateTime = showDateTime;
        this.popularity = popularity;
        this.genre = genre;
        this.district = district;
        this.trailerPath = trailerPath;
        this.details = details;
        this.state = state;
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

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getShowDateTime() {
        return showDateTime;
    }

    public void setShowDateTime(Date showDateTime) {
        this.showDateTime = showDateTime;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getTrailerPath() {
        return trailerPath;
    }

    public void setTrailerPath(String trailerPath) {
        this.trailerPath = trailerPath;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", star=" + star +
                ", decoration='" + decoration + '\'' +
                ", director=" + director +
                ", price=" + price +
                ", showDateTime=" + showDateTime +
                ", popularity=" + popularity +
                ", genre=" + genre +
                ", district=" + district +
                ", trailerPath='" + trailerPath + '\'' +
                ", details='" + details + '\'' +
                ", state=" + state +
                '}';
    }
}
