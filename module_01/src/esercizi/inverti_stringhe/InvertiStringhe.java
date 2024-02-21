package esercizi.inverti_stringhe;

public class InvertiStringhe {
    public static void main(String[] args) {
        /*
        ESERCIZIO "INVERTI STRINGHE"
        Scrivere un programma Java che, data una stringa, stampi la stessa stringa invertendone il contenuto a partire
        dal primo spazio, ad esempio data la stringa "come stai" stampi a video "stai come".
        Potete dare per assunto che la stringa conterrà sempre e solo uno spazio.
         */

        // Inizializzo la stringa con le parole da invertire di posizione
        String stringToInvert = "come stai";

        // Ottengo l'indice della posizione in cui è lo spazio
        int indexOfSpace = stringToInvert.indexOf(" ");

        // Ottengo la prima e la seconda parola
        String firstWord = stringToInvert.substring(0, indexOfSpace);
        String secondWord = stringToInvert.substring(indexOfSpace + 1);

        // Stampo su console le due parole invertite di posto
        System.out.println(secondWord + " " + firstWord);
    }
}
