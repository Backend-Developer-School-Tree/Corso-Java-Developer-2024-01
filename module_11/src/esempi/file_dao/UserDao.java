package module_11.src.esempi.file_dao;

import java.util.List;

public interface UserDao
{
    User insert(User.Builder u);
    User update(User u);
    boolean delete(int id);
    User get(int id);
    List<User> getAll();
}
