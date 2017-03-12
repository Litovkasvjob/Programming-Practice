package practic_3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergLion on 26.01.2017.
 */
public class Cinema {



    private Admin admin;
    private Hall[] halls;
    private List<User> listUsers;
    private List<Session> listSessions;
    private List<Film> listFilms;

    private static volatile Cinema cinema;
    // create Singleton

    public Cinema() {
        //this.admin = new Admin();
        this.halls = new Hall[3];
        this.listUsers = new ArrayList<>();
        this.listSessions = new ArrayList<>();
        this.listFilms = new ArrayList<>();
    }

    public static Cinema getCinema() {
        if (cinema == null) {
            synchronized (Cinema.class) {
                if (cinema == null) {
                    cinema = new Cinema();
                }
            }
        }
        return cinema;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Hall[] getHalls() {
        return halls;
    }

    public void setHalls(Hall[] halls) {
        this.halls = halls;
    }

    public List<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    public List<Session> getListSessions() {
        return listSessions;
    }

    public void setListSessions(List<Session> listSessions) {
        this.listSessions = listSessions;
    }

    public boolean addSession(Session session) {
        return listSessions.add(session);
    }

    public List<Film> getListFilms() {
        return listFilms;
    }

    public void setListFilms(List<Film> listFilms) {
        this.listFilms = listFilms;
    }
}
