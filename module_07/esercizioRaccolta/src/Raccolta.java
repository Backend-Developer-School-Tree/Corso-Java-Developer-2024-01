import java.util.HashSet;

public class Raccolta extends AbstractRaccolta{

    Raccolta() {
        songs = new HashSet<>();
    }


    @Override
    public String toString() {
        return "HashsetPlayList{" +
                "songs=" + songs +
                '}';
    }
}
