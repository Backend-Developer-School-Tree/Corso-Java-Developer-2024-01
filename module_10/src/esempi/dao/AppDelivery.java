package esempi.dao;

public class AppDelivery
{
    UserDao userDao = new UserDaoSQL(); // new UserDaoCollection();
    // MovieDao movieDao ...
    // FavouriteDao favouriteDao ...

    public void registraNuovoUtente(User u)
    {
        // aggiungo controlli relativi alla logica di business
        // es. controllo se già esiste un utente con lo stesso id
        // nel caso di UserDaoSQL getUser farà una query del tipo "SELECT FROM utenti WHERE id = u.id"
        if (userDao.getUser(u.id) == null)
        {
            // se non esiste un utente lo creo
            // nel caso di UserDaoSQL insertUser farà una query del tipo "INSERT INTO ..."
            userDao.insertUser(u);
        }
    }

    // ...
}
