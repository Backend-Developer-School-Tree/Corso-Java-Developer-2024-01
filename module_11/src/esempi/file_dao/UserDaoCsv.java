package module_11.src.esempi.file_dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.TreeMap;

public class UserDaoCsv implements UserDao
{
    private Path filePath;

    private TreeMap<Integer, User> userMap = new TreeMap<>();

    public UserDaoCsv(Path filePath) throws IOException {
        this.filePath = filePath;

        // 0. controllo che il file esista, lo creo se non esiste

        if (!Files.exists(filePath)) Files.createFile(filePath);
        else
        {
            // 1. leggere tutti gli utenti nel file già esistente

            try (BufferedReader br = Files.newBufferedReader(filePath)) {
                String line;
                while ((line = br.readLine()) != null) // finché readLine ha righe da leggere
                {
                    // riga (stringa) --> Utente
                    // 2. salvare gli utenti dal file in collection
                    String[] attributes = line.split(",");
                    int id = Integer.parseInt(attributes[0]);
                    userMap.put(id, new User(id, attributes[1], attributes[2], LocalDate.parse(attributes[3])));
                }
            }
            // finally { br.close() } // implicito grazie al try-with-resources
        }

        // ogni volta che dobbiamo fare un'operazione
        // 1. aggiorniamo la collection
        // 2. aggiorniamo il file scrivendoci la collection aggiornata

        // ALTERNATIVA PIù COMPLESSA
        // per ogni operazione leggiamo il file e inseriamo/modifichiamo solo la riga coinvolta
    }

    private boolean save() throws IOException
    {
        // TODO da finire
        try (BufferedWriter bw = Files.newBufferedWriter(filePath))
        {
            // Utente --> stringa (riga)
            // per ogni utente nella collection
            // scriviamo una nuova riga del file con gli attributi di utente separati da virgole
        }
        // ATTENZIONE: in questo modo in caso il salvataggio non vada a buon fine il programma non si interrompe
        /*
        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
        */

        return true;
    }

    @Override
    public User insert(User.Builder u)
    {
        int lastId = 0;

        if (!userMap.isEmpty()) lastId = userMap.lastKey();

        u.id(lastId + 1);
        User user = u.build();

        userMap.put(u.getId(), user);

        // TODO save();

        return user;
    }

    @Override
    public User update(User u) {
        // TODO
        // user.replace()
        // save()
        return null;
    }

    @Override
    public boolean delete(int id) {
        // TODO
        return false;
    }

    @Override
    public User get(int id) {
        // TODO
        return null;
    }

    @Override
    public List<User> getAll() {
        // TODO
        return null;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new UserDaoCsv(Paths.get("module_11", "src", "esempi", "file_dao", "resources", "users.csv")).userMap);
        // riga (stringa) --> Utente
        // Utente --> stringa (riga)

        // POSSIBILE OPZIONE: CERCO GLI INDICI DI TUTTE LE VIRGOLE E FACCIO UN FOR
        // while (riga1.isPresent(","))
        //      attributo = substring(indiceVirgolaPrecedente, indexOf(","))

        // Utente utente = new Utente(???)

        // RECUPERARE GLI UTENTI DA FILE
        // riga (stringa) --> Utente

        String riga1 = "0,Andrea,Gasparini,1990-01-01";

        // riga1 --> ["0", "Andrea", "Gasparini", "1990-01-01"]

        String[] attributi = riga1.split(",");

        // ["0", "Andrea", "Gasparini", "1990-01-01"] --> Utente

        User user = new User(Integer.parseInt(attributi[0]), attributi[1], attributi[2], LocalDate.parse(attributi[3]));

        // INSERIRE GLI UTENTI NEL FILE
        // Utente --> stringa (riga)

        // String userStr = user.getId() + "," + user.getName() + ...

        String[] userAttributes = {String.valueOf(user.getId()), user.getName(), user.getLastName(), user.getBirthday().toString()};

        // ["0", "Andrea", "Gasparini", "1990-01-01"] --> "0,Andrea,Gasparini,1990-01-01"

        String userStr = String.join(",", userAttributes);

        // scriviamo direttamente userStr nel file
    }
}
