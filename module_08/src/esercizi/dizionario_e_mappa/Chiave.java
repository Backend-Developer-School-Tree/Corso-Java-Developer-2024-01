package esercizi.dizionario_e_mappa;

import java.util.Objects;

public class Chiave<K>
{
    K key;

    public Chiave(K key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chiave<?> chiave = (Chiave<?>) o;
        // nel caso in cui il tipo di K non sia un tipo primitivo
        // DOBBIAMO fare attenzione a che equals sia implementato a sua volta
        // altrimenti ci ritroveremo a confrontare indirizzi di memoria (come ==)
        return key.equals(chiave.key);
    }

    @Override
    public int hashCode() {
        // idem per hashCode, K DEVE implementare il metodo hashCode
        return Objects.hash(key);
    }
}
