package practic_3.model;

import lombok.Data;

import java.util.List;

/**
 * Created by SergLion on 26.01.2017.
 */
@Data
public class Session {
    private Film film;
    private Time time;

    public Session(Film film, Time time) {
        this.film = film;
        this.time = time;
    }

}
