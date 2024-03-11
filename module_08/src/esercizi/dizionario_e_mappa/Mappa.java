package esercizi.dizionario_e_mappa;

import esercizi.dizionario_e_mappa.exceptions.ElementAlreadyExistingException;
import esercizi.dizionario_e_mappa.exceptions.ElementNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class Mappa<K, E> implements Dizionario<K, E>
{
    Set<Coppia<K, E>> coppie = new HashSet<>();

    @Override
    public Elemento<E> search(Chiave<K> key) throws ElementNotFoundException {
        // 1. controllo se la chiave in input è contenuta nel Set di coppie
        // 1.bis scorro tutti gli elementi del Set di coppie e cerco quella con chiave uguale
        for (Coppia<K, E> coppia : coppie) {
            // 2. confronto la chiave in input con la chiave della coppia
            //    ritorno l'elemento associato alla chiave in input
            if (coppia.getChiave().equals(key)) return coppia.getElemento();
        }
        // 3. sollevo l'eccezione ElementNotFoundException se l'elemento non esiste
        throw new ElementNotFoundException();
    }

    @Override
    public void add(Chiave<K> key, Elemento<E> element) throws ElementAlreadyExistingException {
        Coppia<K, E> newCoppia = new Coppia<>(key, element);
        // 1. controllo se la chiave (key) è già presente nella mappa
        if (coppie.contains(newCoppia)) throw new ElementAlreadyExistingException();
        // 2. aggiungo la nuova coppia nella mappa
        else coppie.add(newCoppia);
    }

    @Override
    public Elemento<E> delete(Chiave<K> key) {
        Elemento<E> elementoDaRimuovere = null;
        // 1. per ogni coppia contenuta nel Set di coppie
        //    controllo se la chiave in input è contenuta nella coppia
        for (Coppia<K, E> coppia : coppie) {
            // 2. se la chiave in input è uguale a quella della coppia
            if (coppia.getChiave().equals(key)) {
                // 3. rimuovo l'elemento dalla coppia
                elementoDaRimuovere = coppia.getElemento();
                coppia.removeElemento();
                return elementoDaRimuovere;
            }
        }
        return elementoDaRimuovere;
    }

    @Override
    public int size() { return coppie.size(); }

    @Override
    public String toString() {
        return "Mappa{" +
                "coppie=" + coppie +
                '}';
    }
}
