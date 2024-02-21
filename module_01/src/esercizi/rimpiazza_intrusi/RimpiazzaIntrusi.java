package esercizi.rimpiazza_intrusi;

public class RimpiazzaIntrusi {
    public static void main(String[] args) {
        /*
        ESERCIZIO "RIMPIAZZA GLI INTRUSI"
        Date tre stringhe a, b e c, stampare c dopo aver rimpiazzato, al suo interno, ogni occorrenza compresa tra
        due spazi di a con b. Ad esempio, date in input le stringhe "a", "b", "a abc d", stampare a video "a bbc d".
        Potete dare per assunto che la stringa c conterrà sempre e solo due spazi.
         */

        // Inizializzo le tre stringhe a, b e c
        String a = "a";
        String b = "b";
        String c = "a abc d";

        // Separo tramite i metodi indexOf() e substring() di String le tre parti della stringa c
        int spaceIndex = c.indexOf(" "); // spaceIndex = 1
        String cFirstPart = c.substring(0, spaceIndex); // cFirstPart = "a"
        String cSecondPart = c.substring(spaceIndex + 1); // cSecondPart = "abc d"
        spaceIndex = cSecondPart.indexOf(" "); // spaceIndex = 3
        String cThirdPart = cSecondPart.substring(spaceIndex + 1); // cThirdPart = "d"
        cSecondPart = cSecondPart.substring(0, spaceIndex); // cSecondPart = "abc"

        // Effetto la sostituzione
        cSecondPart = cSecondPart.replaceAll(a, b); // cSecondPart = "bbc"

        // Stampo su console i valori iniziali e l'output risultante
        System.out.println("Stringa a (intruso): " + a);
        System.out.println("Stringa b: " + b);
        System.out.println("Stringa c: " + c);
        System.out.println("Stringa c dopo la rimozione degli intrusi: " + cFirstPart + " " + cSecondPart + " " + cThirdPart);
    }
}
