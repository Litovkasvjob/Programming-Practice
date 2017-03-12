package practic_3.model;

/**
 * Created by SergLion on 26.01.2017.
 */
public class Film {

    private String nameFilm;
    private long duration = 0;

    public Film(String nameFilm, long duration) {
        this.nameFilm = nameFilm;
        this.duration = duration;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nameFilm='" + nameFilm + '\'' +
                ", duration=" + duration +
                '}';
    }
}
