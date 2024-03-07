package esercizi.distributore_bevande_map.model;

import java.util.Objects;

public class Prodotto {

    private String codice;
    private double prezzo;

    public Prodotto(String codice, double prezzo) {
        this.codice = codice;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codice='" + codice + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return ((Prodotto) o).codice.equals(codice) && Objects.equals(codice, prodotto.codice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codice);
    }
}
