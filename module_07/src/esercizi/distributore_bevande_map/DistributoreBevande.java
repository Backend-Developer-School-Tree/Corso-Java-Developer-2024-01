package esercizi.distributore_bevande_map;

import esercizi.distributore_bevande_map.model.Prodotto;

import java.util.*;

/*
* Nice to have:
*   - Metodo che stampa direttamente l'importo
*   - Map al posto di una List (private Map<Prodotto, Integer> prodotti)
* */
public class DistributoreBevande {

    private int numeroMassimoProdotti;
    private double saldoAttuale;

    private List<Prodotto> prodotti;

    private Map<Prodotto, Integer> prodotti2quantita;

    public DistributoreBevande(int numeroMassimoProdotti) {
        this.numeroMassimoProdotti = numeroMassimoProdotti;
        saldoAttuale = 0.0;

        //TODO: Da togliere
        prodotti = new ArrayList<>();

        prodotti2quantita = new HashMap<>();
    }

    public void caricaProdotto(Prodotto p){
        //Quanti prodotti ho già caricato?
        int sommaParziale = 0;
        for (Integer q : prodotti2quantita.values()) {
            sommaParziale = sommaParziale + q;
        }

        //Ho spazio nel distributore?
        if(sommaParziale < numeroMassimoProdotti){

            //Se prodotto esiste già allora fai +1 sulla quantità già esistente, altrimenti crea da 0
            if(prodotti2quantita.get(p) == null)
                prodotti2quantita.put(p, 1);
            else {
                Integer qTemp = prodotti2quantita.get(p);
                prodotti2quantita.put(p, qTemp+1); //aggiorno la quantità
            }

        }
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

        for (Map.Entry<Prodotto, Integer> entry : prodotti2quantita.entrySet()) {
            Prodotto prodottoTemp = entry.getKey();
            Integer quantita = entry.getValue();

            if(prodottoTemp.getCodice().equals(codice)){

                if(saldoAttuale-prodottoTemp.getPrezzo() >= 0){
                    Prodotto prodottoTrovato = prodottoTemp;
                    saldoAttuale = saldoAttuale - prodottoTemp.getPrezzo();

                    // Se quantità non è maggiore di uno allora è uguale a 1
                    if(quantita > 1){
                        Integer qta = prodotti2quantita.get(prodottoTemp);
                        prodotti2quantita.put(prodottoTemp, qta-1); //sovrascivo valore vecchio
                    } else {
                        prodotti2quantita.remove(prodottoTemp);
                    }

                    return prodottoTrovato;

                } else
                    System.out.println("ATTENZIONE: CREDITO NON SUFFICIENTE");
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
                ", prodotti=" + prodotti2quantita +
                '}';
    }
}
