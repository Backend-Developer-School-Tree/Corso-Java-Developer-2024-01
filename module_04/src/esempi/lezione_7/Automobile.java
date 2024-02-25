package esempi.lezione_7;

public class Automobile {
    // Attributi
    public static final int ruote = 4;
    public String marchio;
    private String carburante;
    private int numPasseggeri;

    // Costruttori
    public Automobile() {
        this.marchio = "Non definito";
    }

    public Automobile(String marchio, String carburante) {
        this.marchio = marchio;
        this.carburante = carburante;
    }

    public Automobile(String marchio, String carburante, int numPasseggeri) {
        this.marchio = marchio;
        this.carburante = carburante;
        this.numPasseggeri = numPasseggeri;
    }

    // Metodi
    // Getter
    public String getMarchio() {
        return this.marchio;
    }

    public String getCarburante() {
        return this.carburante;
    }

    public int getNumPasseggeri() {
        return this.numPasseggeri;
    }

    // Setter
    public void setMarchio(String marchio) {
        this.marchio = marchio;
    }

    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public void setNumPasseggeri(int numPasseggeri) {
        if (numPasseggeri >= 0) {
            this.numPasseggeri = numPasseggeri;
        } else {
            System.out.println("Errore: numero passeggeri non consentito");
        }
    }

    // Metodi generici
    public void aggiungiPasseggero() {
        this.numPasseggeri++;
    }
}
