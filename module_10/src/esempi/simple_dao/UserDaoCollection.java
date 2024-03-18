package esempi.simple_dao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoCollection implements UserDao
{
    private List<User> users = new ArrayList<>();

    @Override
    public User insertUser(User u) {
        users.add(u);
        return u;
    }

    @Override
    public User updateUser(User u) {
        // cerco l'elemento nella lista con lo stesso id e lo modifico
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        // cerco l'elemento nella lista con lo stesso id e lo elimino
        return false;
    }

    @Override
    public User getUser(int id) {
        // cerco l'elemento nella lista con lo stesso id e lo ritorno
        return null;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
