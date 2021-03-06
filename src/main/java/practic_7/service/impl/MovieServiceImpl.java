package practic_7.service.impl;

import practic_7.dao.DaoFactory;
import practic_7.dao.api.Dao;
import practic_7.dto.MovieDTO;
import practic_7.mapper.BeanMapper;
import practic_7.model.Movie;
import practic_7.service.api.Service;

import java.util.List;

/**
 * Created by SergLion on 22.02.2017.
 */
public class MovieServiceImpl implements Service<Integer, MovieDTO>{

    private static MovieServiceImpl service;
    private Dao<Integer, Movie> movieDao;
    private BeanMapper beanMapper;

    private MovieServiceImpl() {
        movieDao = DaoFactory.getInstance().getMovieDao();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized MovieServiceImpl getInstance() {
        if (service == null) {
            service = new MovieServiceImpl();
        }
        return service;
    }


    @Override
    public List<MovieDTO> getAll() {
        List<Movie> movies = movieDao.getAll();
        List<MovieDTO> movieDTOs = beanMapper.listMapToList(movies, MovieDTO.class);
        return movieDTOs;
    }

    @Override
    public MovieDTO getById(Integer id) {
        MovieDTO movieDTO = beanMapper.singleMapper(movieDao.getById(id), MovieDTO.class);
        return movieDTO;
    }


    @Override
    public void save(MovieDTO entity) {
        Movie movie = beanMapper.singleMapper(entity, Movie.class);
        movieDao.save(movie);
    }


    @Override
    public void delete(Integer key) {
        movieDao.delete(key);

    }

    @Override
    public void update(MovieDTO entity) {
        Movie movie = beanMapper.singleMapper(entity, Movie.class);
        movieDao.update(movie);

    }


}
