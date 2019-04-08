package cn.bdqn.moviePort.service.impl;

import cn.bdqn.moviePort.dao.MovieMapper;
import cn.bdqn.moviePort.pojo.Movie;
import cn.bdqn.moviePort.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {
    private final MovieMapper movieMapper;
    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    @Override
    public List<Movie> getHotMovie() {
        return movieMapper.selectHotMovie();
    }
}