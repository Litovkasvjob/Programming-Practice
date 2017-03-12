package practic_7.dao;

import practic_7.dao.api.Dao;
import practic_7.dao.impl.MovieDaoImpl;
import practic_7.helper.PropertyHolder;
import practic_7.model.Movie;

/**
 * Created by SergLion on 22.02.2017.
 */
public class DaoFactory {
    private static DaoFactory instance = null;

    private Dao<Integer, Movie> movieDao;

    private DaoFactory() {
        loadDAOs();
    }

    public static DaoFactory getInstance() {
        if (instance == null) {
            instance = new DaoFactory();
        }
        return instance;
    }

    private void loadDAOs() {
        if (PropertyHolder.getInstance().isInMemoryDB()) {

        } else {
            movieDao = new MovieDaoImpl(Movie.class);
        }
    }

    public Dao<Integer, Movie> getMovieDao() {
        return movieDao;
    }

    public void setMovieDao(Dao<Integer, Movie> movieDao) {
        this.movieDao = movieDao;
    }
}
