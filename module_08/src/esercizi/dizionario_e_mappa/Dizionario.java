package esercizi.dizionario_e_mappa;

import esercizi.dizionario_e_mappa.exceptions.ElementAlreadyExistingException;
import esercizi.dizionario_e_mappa.exceptions.ElementNotFoundException;

public interface Dizionario<K, E>
{
    /**
     * Cerca l’elemento associato alla chiave key nella struttura dati
     * @param key chiave da ricercare nella struttura dati
     * @return elemento associato alla chiave da ricercare
     * @throws ElementNotFoundException se la chiave non è presente nella struttura dati
     */
    Elemento<E> search(Chiave<K> key) throws ElementNotFoundException;
    /**
     * Aggiunge l’elemento e con chiave key nella struttura dati
     *
     * @param key chiave da aggiungere nella mappa
     * @param element valore associato alla chiave da aggiungere nella mappa
     * @throws ElementAlreadyExistingException se la chiave è già presente nella struttura dati
     */
    void add(Chiave<K> key, Elemento<E> element) throws ElementAlreadyExistingException;

    /**
     * Rimuove l’oggetto associato alla chiave key dalla struttura dati
     *
     * @param key chiave da cui rimuovere l'elemento associato
     * @return l'elemento rimosso
     */
    Elemento<E> delete(Chiave<K> key);
    int size();
}
