package practic_3.model;

/**
 * Created by SergLion on 26.01.2017.
 */
public class User extends Human {

    private Ticket[] tickets;

    private static int idStatic = 1;
    private int id = 0;

    public User(String login, String password) {
        super(login, password);
        this.id = idStatic++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                " " + super.toString();
    }

}
