package cn.bdqn.moviePort.dao;

import cn.bdqn.moviePort.pojo.Movie;

import java.util.List;

public interface MovieMapper {
    //查询人气最高的8部影片
    List<Movie> selectHotMovie();
}
