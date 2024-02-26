package esempi.lezione_8;

import java.util.Arrays;

public class Lezione8 {
    public static void main(String[] args) {
        // Testing classe Menu
        Menu menu = new Menu();
        menu.addOption("Continua");
        menu.addOption("Nuova Partita");
        menu.addOption("Impostazioni");
        menu.addOption("Chiudi");
        menu.showMenu();
        System.out.println(menu);

        // Enumeratori
        SemeCarta seme = SemeCarta.FIORI;

        Mese meseAgosto = Mese.AGO;
        int numAgosto = meseAgosto.toInt();
        System.out.println("Numero mese Agosto: " + numAgosto);

        System.out.println(Arrays.toString(Mese.values()));
        System.out.println(Mese.valueOf("SET"));

        // Comparare oggetti
        String s1 = new String("ciao");
        String s2 = new String("ciao");
        if (!s1.equals(s2)) { // s1 != s2
            System.out.println("Le due stringhe sono uguali");
        } else {
            System.out.println("Le due stringhe NON sono uguali");
        }
    }
}
