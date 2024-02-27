package esercizi.forme_geometriche;

public class Quadrato {
    private int lato;
    private Colore colore;

    public Quadrato(int lato) {
        this.lato = lato;
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
    public int getPerimetro() {
        return this.lato * 4;
    }

    public void print() {
        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                if ( i == 0 || i == lato - 1 || ( i < lato - 1 && (j == 0 || j == lato - 1) ) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
