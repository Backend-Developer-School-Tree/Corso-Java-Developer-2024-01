package esercizi.distributore_bevande;

import esercizi.distributore_bevande.model.Prodotto;

import java.util.List;

public class DistributoreBevande {

    private int numeroMassimoProdotti;
    private double saldoAttuale;

    private List<Prodotto> prodotti;

    public DistributoreBevande(int numeroMassimoProdotti, double importo) {
        this.numeroMassimoProdotti = numeroMassimoProdotti;
        this.saldoAttuale = importo;
    }

    //TODO: Implementare
    public void caricaProdotto(Prodotto p){

    }

    //TODO: Implementare
    public void inserisciImporto(double importo){

    }

    //TODO: Implementare
    public Prodotto scegliProdotto(String codice){
        return null;
    }

    //TODO: Implementare
    public double saldoAttuale(){
        return 0.0;
    }

    //TODO: Implementare
    public double dammiResto(){
        return 0.0;
    }

    public int getNumeroMassimoProdotti() {
        return numeroMassimoProdotti;
    }

    public void setNumeroMassimoProdotti(int numeroMassimoProdotti) {
        this.numeroMassimoProdotti = numeroMassimoProdotti;
    }

    public double getSaldoAttuale() {
        return saldoAttuale;
    }

    public void setSaldoAttuale(double saldoAttuale) {
        this.saldoAttuale = saldoAttuale;
    }
}
