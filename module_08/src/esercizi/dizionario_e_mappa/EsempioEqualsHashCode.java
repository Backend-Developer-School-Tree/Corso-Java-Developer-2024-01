package esercizi.dizionario_e_mappa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class EsempioEqualsHashCode {
    private Integer chiave;
    private String nomeChiave;

    public EsempioEqualsHashCode(int chiave, String nomeChiave) {
        this.chiave = chiave;
        this.nomeChiave = nomeChiave;
    }

    @Override
    public boolean equals(Object object) {
        // se l'oggetto in input sia esattamente l'istanze attuale
        // poiché == confronta l'indirizzo di memoria
        if (this == object) return true;
        // se l'oggetto in input è null possiamo dire direttamente che è diverso
        // rispetto all'istanza attuale (perché this != null sempre se siamo arrivati qui)
        if (object == null) return false;
        // anche se le classi dell'istanza attuale (this) e dell'oggetto in input (object)
        // sono diverse possiamo dire direttamente che gli oggetti sono diversi
        if (this.getClass() != object.getClass()) return false;
        // facciamo il cast dell'oggetto in input alla classe
        EsempioEqualsHashCode chiave = (EsempioEqualsHashCode) object;
        // arrivati a questo punto i due oggetti sono uguali quando uguali su entrambi gli attributi
        return this.chiave.equals(chiave.chiave) && nomeChiave.equals(chiave.nomeChiave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chiave, nomeChiave);
    }

    @Override
    public String toString() {
        return "Chiave{" +
                "integer=" + chiave +
                ", nomeChiave='" + nomeChiave + '\'' +
                '}';
    }

    public static void main(String[] args) {
        EsempioEqualsHashCode key = new EsempioEqualsHashCode(10, "dieci");
        // key.equals(key); // if (this == o) return true;

        System.out.println(key.hashCode());
        System.out.println(new EsempioEqualsHashCode(10, "dieci").hashCode());
        System.out.println(new EsempioEqualsHashCode(20, "venti").hashCode());

        System.out.println(new HashSet<>(Arrays.asList(new EsempioEqualsHashCode(10, "dieci"), new EsempioEqualsHashCode(10, "dieci"))));
    }
}
