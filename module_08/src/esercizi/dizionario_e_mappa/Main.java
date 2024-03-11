package esercizi.dizionario_e_mappa;

import esercizi.dizionario_e_mappa.exceptions.ElementAlreadyExistingException;
import esercizi.dizionario_e_mappa.exceptions.ElementNotFoundException;

public class Main {
    public static void main(String[] args) {
        Mappa<String, Integer> mappa = new Mappa<>();

        mappa.add(new Chiave<>("ciao"), new Elemento<>(4));
        mappa.add(new Chiave<>("buonanotte"), new Elemento<>(12));
        mappa.add(new Chiave<>("ecco"), new Elemento<>(4));

        try { mappa.add(new Chiave<>("ecco"), new Elemento<>(6)); }
        catch (ElementAlreadyExistingException e) { System.out.println("ERRORE ElementAlreadyExistingException"); }

        System.out.println(mappa.size());

        System.out.println(mappa);

        System.out.println(mappa.search(new Chiave<>("ciao")));

        try { System.out.println(mappa.search(new Chiave<>("come"))); }
        catch (ElementNotFoundException e) { System.out.println("ERRORE ElementNotFoundException"); }

        System.out.println(mappa);

        System.out.println(mappa.delete(new Chiave<>("ecco")));

        System.out.println(mappa);
    }
}
