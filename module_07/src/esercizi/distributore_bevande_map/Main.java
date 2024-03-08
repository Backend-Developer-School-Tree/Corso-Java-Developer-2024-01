package esercizi.distributore_bevande_map;

import esercizi.distributore_bevande_map.model.Caffe;
import esercizi.distributore_bevande_map.model.Cappuccino;
import esercizi.distributore_bevande_map.model.Prodotto;

public class Main {

    public static void main(String[] args){

        DistributoreBevande distributoreBevande = new DistributoreBevande(10);

        /* Polimorfismo ed ereditarietà per differenziare i vari prodotti
        * (In questo caso didattico anche fare Prodotto p = new Prodotto)
        * */
        Prodotto caffe = new Caffe("caffe", 0.5);
        Prodotto cappuccino = new Cappuccino("cappuccino", 1);

        distributoreBevande.caricaProdotto(caffe);
        distributoreBevande.caricaProdotto(cappuccino);
        distributoreBevande.caricaProdotto(cappuccino);
        distributoreBevande.caricaProdotto(cappuccino);
        distributoreBevande.caricaProdotto(caffe);
        distributoreBevande.caricaProdotto(caffe);
        distributoreBevande.caricaProdotto(cappuccino);
        distributoreBevande.caricaProdotto(cappuccino);
        distributoreBevande.caricaProdotto(cappuccino);
        distributoreBevande.caricaProdotto(caffe);

        // Qui ottengo un messaggio di errore, superata capacità
        distributoreBevande.caricaProdotto(caffe);
        distributoreBevande.caricaProdotto(cappuccino);

        // Caricato importo
        distributoreBevande.inserisciImporto(2.0);
        System.out.println("Saldo attuale: " + distributoreBevande.saldoAttuale());

        System.out.println("Dammi Resto: " + distributoreBevande.dammiResto());
        System.out.println("Saldo attuale: " + distributoreBevande.saldoAttuale());


        // Scelgo il Prodotto
        distributoreBevande.inserisciImporto(2.0);

        Prodotto caffeTrovato = distributoreBevande.scegliProdotto("caffe");
        System.out.println(caffeTrovato);

        Prodotto cioccolata = distributoreBevande.scegliProdotto("cioccolata");
        System.out.println(cioccolata);

        System.out.println(distributoreBevande);
    }
}
