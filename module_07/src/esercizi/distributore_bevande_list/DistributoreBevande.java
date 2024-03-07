package esercizi.distributore_bevande_list;

import esercizi.distributore_bevande_list.model.Prodotto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* Nice to have:
*   - Metodo che stampa direttamente l'importo
*   - Map al posto di una List (private Map<Prodotto, Integer> prodotti)
* */
public class DistributoreBevande {

    private int numeroMassimoProdotti;
    private double saldoAttuale;

    private List<Prodotto> prodotti;

    public DistributoreBevande(int numeroMassimoProdotti) {
        this.numeroMassimoProdotti = numeroMassimoProdotti;
        saldoAttuale = 0.0;
        prodotti = new ArrayList<>();
    }

    public void caricaProdotto(Prodotto p){
        if(prodotti.size() < numeroMassimoProdotti)
            prodotti.add(p);
        else
            System.out.println("ATTENZIONE: SUPERATA CAPACITA' MASSIMA");
    }

    //Incremento il saldo corrente, utente ha inserito la moneta nel distributore :)
    public void inserisciImporto(double importo){
        saldoAttuale += importo; //saldoAttuale = saldoAttuale + importo
    }

    public double saldoAttuale(){
        return saldoAttuale;
    }

    //Rimuove prodotto dalla lista e lo restituisce all'utente. Se non lo trova, messaggio di errore
    public Prodotto scegliProdotto(String codice){
        Iterator<Prodotto> prodottoIterator = prodotti.iterator();

        while(prodottoIterator.hasNext()){
            Prodotto prodottoTemp = prodottoIterator.next();

            if(prodottoTemp.getCodice().equals(codice)){

                // Ho i soldi per comprare il prodotto?
                if(saldoAttuale-prodottoTemp.getPrezzo() >= 0){
                    Prodotto prodottoTrovato = prodottoTemp;
                    saldoAttuale = saldoAttuale - prodottoTemp.getPrezzo();
                    prodottoIterator.remove();

                    return prodottoTrovato;

                } else {
                    System.out.println("ATTENZIONE: CREDITO NON SUFFICIENTE");

                    return null;
                }
            }
        }

        return null;
    }

    // Occhio che il saldo non posso azzerarlo se non l'ho prima salvato in una var di appoggio
    // Mi da indietro il saldo che viene visualizzato sul display e lo azzero (mi faccio tornare le monete)
    public double dammiResto(){
        double saldoDaRestituire = saldoAttuale;
        saldoAttuale = 0.0;

        return saldoDaRestituire;
    }

    @Override
    public String toString() {
        return "DistributoreBevande{" +
                "numeroMassimoProdotti=" + numeroMassimoProdotti +
                ", saldoAttuale=" + saldoAttuale +
                ", prodotti=" + prodotti +
                '}';
    }
}
