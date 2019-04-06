package cn.bdqn.moviePort.service;

import cn.bdqn.moviePort.pojo.Movie;

import java.util.List;

public interface IMovieService {

    /**
     * 查询人气最高的8部影片
     * @return 8部影片的List集合
     */
    List<Movie> getHotMovie();
}