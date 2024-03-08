package esempi.eccezioni.lista_di_interi;

import esempi.eccezioni.lista_di_interi.exceptions.ElementoNonEsistenteException;
import esempi.eccezioni.lista_di_interi.exceptions.IndiceNonValidoException;
import esempi.eccezioni.lista_di_interi.exceptions.ListaDiInteriException;

import java.util.Arrays;

public class ListaDiInteri {

    int[] array = new int[0];

    ListaDiInteri() {}

    ListaDiInteri(int[] array) {
        this.array = array;
    }

    /**
     * Restituisce l’indice della posizione dell’intero fornito in input
     *
     * @param el elemento di cui cercare la posizione all'interno della lista
     * @return l'indice dell'elemento cercato se presente, -1 altrimenti
     */
    public int indexOf(int el) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == el)
                return i;
        }
        // invece che ritornare un valore negativo di "errore"
        // return -1;

        // throw new RuntimeException("Elemento \"" + el + "\" non presente nella lista: " + this.toString());
        throw new ElementoNonEsistenteException(el, this);
        // "this" fa riferimento all'istanza attuale della classe (ListaDiInteri)
    }

    public String toString() { return Arrays.toString(array); }

    public boolean contains(int el) { return indexOf(el) != -1; }

    public int get(int i) throws IndiceNonValidoException
    {
        // Opzione 1: controllo con if e sollevo l'eccezione
        // if (i < 0 || i >= array.length) throw new IndiceNonValidoException(i);
        // return array[i];

        // Opzione 2: try-catch su ArrayIndexOutOfBounds (l'eccezione che vogliamo rimpiazzare)
        try { return array[i]; }
        catch (ArrayIndexOutOfBoundsException e) { throw new IndiceNonValidoException(i, this); }
    }

    public static void main(String[] args) {
        ListaDiInteri l = new ListaDiInteri();
        //l.get(0);
        l.indexOf(0);
    }

    /**
     * @return lunghezza della lista di interi
     */
    public int length() { return array.length; }

    /**
     * Aggiunge un valore nella lista di interi, estendendo la dimensione dell'array di 1
     *
     * @param el l'intero da aggiungere alla lista
     */
    public void add(int el) {
        // estendiamo la dimensione dell'array di 1
        // così da poter aggiungere un nuovo valore
        int[] tmp = new int[array.length+1];

        // copiamo ogni intero nel nuovo array esteso di lunghezza
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }

        // salviamo nel campo array il riferimento in memoria dell'array esteso
        array = tmp;
        // aggiungiamo il nuovo valore in ultima posizione
        array[array.length-1] = el;
    }

    /**
     * Aggiunge un intero nella posizione specificata
     * @param el
     */
    public void addAt(int el, int index) {
        int[] tmp = new int[array.length+1];

        tmp = copy(array, tmp, index);

        // inseriamo l'elemento all'indice specificato
        tmp[index] = el;

        // copiamo la seconda metà degli elementi "shiftandoli di 1"
        for (int i = index+1; i < array.length+1; i++) {
            tmp[i] = array[i-1];
        }

        array = tmp;
    }

    public int[] copy(int[] srcArray, int[] targetArray, int untilIndex) {
        // copiando la prima metà degli elementi nella stessa posizione in cui erano
        // fino all'indice a cui dobbiamo inserire
        for (int i = 0; i < untilIndex; i++) {
            targetArray[i] = srcArray[i];
        }
        return targetArray;
    }

    public void remove(int el) {
        int index = indexOf(el);

        // se non c'è nessuna occorrenza dell'elemento da rimuovere
        // non facciamo nulla
        if (index == -1) return;

        pop(index);
    }

    public void pop(int index) {

        if (length() < index) return;

        // in caso contrario accorciamo l'array di 1
        int[] tmp = new int[array.length-1];

        tmp = copy(array, tmp, index); // TODO vedere System.arraycopy();

        // copiamo la seconda metà degli elementi "shiftandoli di 1"
        for (int i = index; i < array.length-1; i++) {
            tmp[i] = array[i+1];
        }

        array = tmp;
    }
}
