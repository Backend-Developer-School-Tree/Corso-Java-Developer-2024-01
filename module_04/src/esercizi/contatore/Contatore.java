package esercizi.contatore;

public class Contatore {
    // Attributi
    private int contatore;

    // Costruttori
    public Contatore() {
        this.contatore = 0;
    }

    public Contatore(int contatore) {
        this.contatore = contatore;
    }

    // Getter
    public int getContatore() {
        return this.contatore;
    }

    // Metodi
    public void incrementa() {
        this.contatore++;
    }

    public void reset() {
        this.contatore = 0;
    }

    public void reset(int contatore) {
        this.contatore = contatore;
    }
}
