package esempi.lezione_7;

public class Lezione7 {
    public static void main(String[] args) {
        // Creazione istanze della classe Automobile
        Automobile auto1 = new Automobile("Audi", "Benzina", 5);
        Automobile auto2 = new Automobile("BMW", "Diesel");
        Automobile auto3 = new Automobile();

        // Accesso agli attributi delle istanze
        System.out.println(auto1.getMarchio());
        auto1.marchio = "Fiat";
        System.out.println(auto1.marchio);

        auto2.setNumPasseggeri(-1);
        System.out.println(auto2.getNumPasseggeri());

        // Chiamata di un metodo dell'oggetto
        auto2.aggiungiPasseggero();
        System.out.println(auto2.getNumPasseggeri());

        // Metodo statico
        System.out.println(Utilities.moltiplica(2, 3));
    }
}
