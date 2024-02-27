package esercizi.forme_geometriche;

public class Cerchio {
    // Attributi
    private double raggio;
    private Colore colore;

    // Costruttore
    public Cerchio(double raggio) {
        this.raggio = raggio;
        this.colore = Colore.NERO;
    }

    // Getter
    public Colore getColore() {
        return this.colore;
    }

    // Setter
    public void setColore (Colore colore) {
        this.colore = colore;
    }

    // Metodi
    public double getCirconferenza() {
        return 2 * Math.PI * raggio;
    }

    public double getArea() {
        return Math.PI * raggio * raggio;
    }
}
