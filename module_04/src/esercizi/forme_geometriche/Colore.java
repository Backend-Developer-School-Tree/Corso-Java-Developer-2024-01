package esercizi.forme_geometriche;

public class Colore {
    // Attributi
    public static final Colore BIANCO = new Colore(0, 0, 0);
    public static final Colore NERO = new Colore(255, 255, 255);
    private int r;
    private int g;
    private int b;

    // Costruttore
    public Colore(int r, int g, int b) {
        if (r < 0 || r > 255) {
            System.out.println("Errore! Il valore della componente 'Rosso' deve essere compreso tra 0 e 255");
        } else {
            this.r = r;
        }

        if (g < 0 || g > 255) {
            System.out.println("Errore! Il valore della componente 'Giallor' deve essere compreso tra 0 e 255");
        } else {
            this.g = g;
        }

        if (b < 0 || b > 255) {
            System.out.println("Errore! Il valore della componente 'Blu' deve essere compreso tra 0 e 255");
        } else {
            this.b = b;
        }
    }

    // Getter
    public int getR() {
        return this.r;
    }

    public int getG() {
        return this.g;
    }

    public int getB() {
        return this.b;
    }

    // Setter
    public void setR(int r) {
        if (r < 0 || r > 255) {
            System.out.println("Errore! Il valore della componente 'Rosso' deve essere compreso tra 0 e 255");
        } else {
            this.r = r;
        }
    }

    public void setG(int g) {
        if (g < 0 || g > 255) {
            System.out.println("Errore! Il valore della componente 'Giallo' deve essere compreso tra 0 e 255");
        } else {
            this.g = g;
        }
    }

    public void setB(int b) {
        if (b < 0 || b > 255) {
            System.out.println("Errore! Il valore della componente 'Blu' deve essere compreso tra 0 e 255");
        } else {
            this.b = b;
        }
    }

    public String toString() {
        return "RGB(" + this.r + ", " + this.g + ", " + this.b + ")";
    }
}
