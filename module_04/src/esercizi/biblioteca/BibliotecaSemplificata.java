package esercizi.biblioteca;

import java.util.Arrays;

public class BibliotecaSemplificata {
    // Attributi
    private int[] libri;

    // Costruttore
    public BibliotecaSemplificata(int[] libri) {
        this.libri = libri;
        Arrays.sort(this.libri);
    }

    // Metodi
    public boolean esisteLibro(int libro) {
        for (int i = 0; i < this.libri.length; i++) {
            if (this.libri[i] == libro) {
                return true;
            }
        }
        return false;
    }

    public int[] getIndiciLibriOrdinati() {
        return this.libri;
    }
}
