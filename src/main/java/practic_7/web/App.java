package practic_7.web;

import practic_7.datasource.DataSource;
import practic_7.dto.MovieDTO;
import practic_7.helper.PropertyHolder;
import practic_7.service.impl.MovieServiceImpl;

import java.sql.SQLException;

/**
 * Created by SergLion on 22.02.2017.
 */
public class App {
    public static void main(String[] args) {
        MovieDTO movieDTO = new MovieDTO("Title", "Description", 124);
        MovieServiceImpl.getInstance().save(movieDTO);

        System.out.println(MovieServiceImpl.getInstance().getById(1));
//
//        System.out.println(MovieServiceImpl.getInstance().getById(1));
//        System.out.println(PropertyHolder.getInstance().getDbDriver());
//        System.out.println(PropertyHolder.getInstance().getJdbcUrl());
//        System.out.println(PropertyHolder.getInstance().getDbUserLogin());
//        System.out.println(PropertyHolder.getInstance().getDbUserPassword());

//        try {
//            System.out.println(DataSource.getInstance().getConnection().isClosed());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}
