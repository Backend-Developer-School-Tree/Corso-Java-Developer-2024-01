package esercizi.esercizioRaccolta.src;

import java.util.TreeSet;

public class RaccoltaOrdinata extends AbstractRaccolta{

    public RaccoltaOrdinata() {
        songs = new TreeSet<>();
    }
    @Override
    public String toString() {
        return "TreeSetPlayList{" +
                "songs=" + songs +
                '}';
    }
}
