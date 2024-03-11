package esercizi.dictionary;

import java.util.*;

public class Main {
    private static Dizionario d = new Dizionario();

    public static void main(String[] args) {
        d.addWord("prova", "significato di prova");
        addWord("caldo", Arrays.asList("alta temperatura", "pieno di pressione"));
        addWord("caldo", new ArrayList<>(Arrays.asList("alta temperatura", "pieno di pressione")));
        // d.addWord("caldo", "afoso");
        d.addWord("calcio", "sport");
        d.addWord("zorro", "personaggio di fantasia");
        d.addWord("amici", "significato di amici");
        System.out.println(d);
    }

    public static void addWord(String word, List<String> significati) {
        try {
            d.addWord(word, significati);
        }
        catch (WordAlreadyExistingException e) {
            System.out.println("PROSEGUIAMO CON IL PROGRAMMA ANCHE IN CASO DI ERRORE: " + e.getMessage());
        }
    }
}