package esercizi.dizionario_e_mappa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Coppia<K, E>
{
    private Chiave<K> chiave; // omettere private --> default: visibilità di package
    private Elemento<E> elemento;

    public Coppia(Chiave<K> k, Elemento<E> e) {
        chiave = k;
        elemento = e;
    }

    public Chiave<K> getChiave() { return chiave; }

    public Elemento<E> getElemento() { return elemento; }

    public void removeElemento() { this.elemento = null; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coppia<?, ?> coppia = (Coppia<?, ?>) o;
        // questo funziona SOLO se implementiamo
        // equals anche nella classe Chiave
        // altrimenti confronta l'indirizzo di memoria (come ==)
        return chiave.equals(coppia.chiave);
        // return chiave.key.equals(coppia.chiave.key);
    }

    @Override
    public int hashCode() {
        // questo funziona SOLO se implementiamo
        // hasCode anche nella classe Chiave
        return Objects.hash(chiave);
        // return Objects.hash(chiave.key);
    }

    @Override
    public String toString() {
        return "Coppia{" +
                "chiave=" + chiave.key +
                ", elemento=" + elemento +
                '}';
    }

    public static void main(String[] args) {
        Set<Coppia<Integer, String>> set = new HashSet<>();
        // .equals()    --> se non lo ridefiniamo si comporta come ==
        // ==           --> confronta gli indirizzi di memoria
        Coppia<Integer, String> pair = new Coppia<>(new Chiave<>(1), new Elemento<>("ciao"));
        // perciò se inseriamo esattamente lo stesso oggetto non lo duplica nel Set
        set.add(pair);
        set.add(pair);
        // altrimenti accetterà anche duplicati sulla chiave, va modificato equals!!!
        set.add(new Coppia<>(new Chiave<>(1), new Elemento<>("ciao")));
        set.add(new Coppia<>(new Chiave<>(1), new Elemento<>("ciao diverso")));
        System.out.println(set);
    }
}
