package esempi.dao;

import java.util.List;

// interface ----extends---> interface
// class     --implements--> interface
public interface UserDao
{
    User insertUser(User u);
    User updateUser(User u);
    boolean deleteUser(int id);
    User getUser(int id);
    List<User> getUsers();
}
