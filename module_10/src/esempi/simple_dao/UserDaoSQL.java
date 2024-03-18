package esempi.simple_dao;

import java.sql.Connection;
import java.util.List;

public class UserDaoSQL implements UserDao
{
    // Connection ...

    @Override
    public User insertUser(User u) {
        // INSERT INTO public.users (name, last_name, birthday) VALUES (u.name, u.lastName, u.birthday);
        // ...
        // ResultSet rs = ps.returnGeneratedKeys();
        return null;
    }

    @Override
    public User updateUser(User u) {
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public User getUser(int id) {
        // "SELECT * FROM utenti WHERE id = id"
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
