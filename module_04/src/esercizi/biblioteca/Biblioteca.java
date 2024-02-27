package esercizi.biblioteca;

import java.util.Arrays;
import java.util.Comparator;

public class Biblioteca {
    // Attributi
    private Libro[] libri;

    // Costruttore
    public Biblioteca(Libro[] libri) {
        this.libri = libri;
    }

    // Metodi
    public boolean esisteLibro(int indice) {
        for (int i = 0; i < this.libri.length; i++) {
            if (this.libri[i].getIndice() == indice)
                return true;
        }
        return false;
    }

    public Libro[] getLibriOrdinati() {
        Arrays.sort(this.libri, Comparator.comparing(Libro::getIndice));
        return this.libri;
    }
}
