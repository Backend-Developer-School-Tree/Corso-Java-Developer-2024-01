import java.util.Set;

//creo la classe astratta perché sono sicuro che lavoreranno sulla stessa interfaccia di Set quindi utilizzo la
//stessa variabile ma inizializzandola sulla classe figlia
public abstract class AbstractRaccolta {
    protected Set<Song> songs;
    public void add(Song song) {
        songs.add(song);
    }
}
