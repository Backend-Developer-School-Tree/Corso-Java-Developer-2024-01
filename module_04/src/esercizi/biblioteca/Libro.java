package esercizi.biblioteca;

public class Libro {
    // Attributi
    private int indice;
    private String titolo;
    private String autore;

    // Costruttore
    public Libro(int indice, String titolo, String autore) {
        this.indice = indice;
        this.titolo = titolo;
        this.autore = autore;
    }

    // Setter
    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    // Getter
    public int getIndice() {
        return this.indice;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getAutore() {
        return this.autore;
    }

    public String toString() {
        return "Libro => Indice: " + this.indice + " | Titolo: " + this.titolo + " | Autore: " + this.autore;
    }
}
