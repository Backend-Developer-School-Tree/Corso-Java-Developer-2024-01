package esercizi.dictionary;

public class Lettera implements Comparable<Lettera>
{
    private char lettera;

    public Lettera(char lettera) {
        this.lettera = lettera;
    }

    @Override
    public String toString() {
        return lettera + "";
    }

    @Override
    public int compareTo(Lettera o) {
        return Character.compare(this.lettera, o.lettera);
    }
}
