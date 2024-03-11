package esercizi.dictionary;

import java.util.*;

public class Dizionario {

    private Map<Lettera, Map<String, Set<String>>> listaParole;
    // List<Coppia<Character, Map<String, Set<String>>>


    public Dizionario(){
        listaParole = new TreeMap<>();
    }

    /**
     * ADD WORD
     * @param word
     * @param significati
     */
    public void addWord(String word, Collection<String> significati){
        // se il primo carattere della parola in input (es. "cane" --> 'c') esiste già nella mappa
        Lettera firstLetter = new Lettera(word.charAt(0));
        if(listaParole.containsKey(firstLetter)){
            // recuperiamo la mappa <Parola, List<Significato>>
            // in base al carattere iniziale della parola in input (es. 'c')
            Map<String,Set<String>> tmp = listaParole.get(firstLetter);
            // if mappa delle parole contiene la nuova parola in input
            // es. "cane" è già presente (già stata inserita precedentemente)
            if (tmp.containsKey(word))
            {
                // allora generiamo un errore di tipo WordAlreadyExistingException
                throw new WordAlreadyExistingException(word);
            }
            // altrimenti inseriamo la NUOVA parola con i significati associati
            // rimuovendo eventuali duplicati
            tmp.put(word, new HashSet<>(significati));
        }
        // se il primo carattere della parola in input (es. "cane" --> 'c') non esiste già nella mappa
        // in altre parole, se non è mai stata inserita una parola che inizia con quel carattere
        else {
            // creando una nuova mappa <Parola, List<Significato>>
            Map<String,Set<String>> tmpHashMap = new HashMap<>();
            // inseriamo la NUOVA parola con i significati associati
            tmpHashMap.put(word, new HashSet<>(significati));
            // inseriamo anche la NUOVA lettera con la parola e i significati associati
            listaParole.put(firstLetter, tmpHashMap);
        }
    }

    public void addWord(String word, String significato) {
        addWord(word, List.of(significato));
    }

    /**
     * ADD MEAN
     * @param word
     * @param significato
     */
    public void aggiungiSignificato(String word, String significato)
    {
        // recuperiamo la mappa <Parole, Set<Significato>>
        Map<String, Set<String>> map = listaParole.get(new Lettera(word.charAt(0)));
        // se la parola è già contenuta nel dizionario
        if (map.containsKey(word)) {
            // recuperiamo i significati già esistenti
            Set<String> significatiEsistenti = map.get(word);
            // se il significato è già contenuto nel dizionario associato alla parola in input
            if (significatiEsistenti.contains(significato)) {
                // allora generiamo un errore di tipo WordAlreadyExistingException
                throw new MeaningAlreadyExistingException(significato, word);
            }
            // altrimenti aggiungiamo il significato tra quelli associati alla parola in input
            significatiEsistenti.add(significato);
        }
        // altrimenti, se la parola non è già contenuta nel dizionario
        else {
            // aggiungiamo la parola tramite il metodo addWord
            addWord(word, significato);
        }
    }

    @Override
    /**
     * ritorna una stringa contenente ogni parola e significato presente nel dizionario
     * (in ordine lessicografico ascendente in base alla lettera)
     *
     * es:
     * lettera1: [parola1: (significato1;significato2;...;), parola2: (significato1;...;...;)]
     * lettera2: [parola1: (significato1;significato2;...;), parola2: (significato1;...;...;)]
     * ...
     * letteraN: [parola1: (significato1;significato2;...;), parola2: (significato1;...;...;)]
     */
    public String toString() {
        String out = "";
        // for coppie (chiave, valore)
        // for (Map.Entry<Character, Map<String, Set<String>>> coppiaChiaveValore : listaParole.entrySet()) {
        for (Lettera lettera : listaParole.keySet()) {
            // Character lettera = coppiaChiaveValore.getKey();
            Map<String, Set<String>> mappaParole = listaParole.get(lettera);

            // lettera1:
            out += lettera + ": ";

            for (Map.Entry<String, Set<String>> stringSetEntry : mappaParole.entrySet()) {
                String parola = stringSetEntry.getKey();
                Set<String> significati = stringSetEntry.getValue();

                // lettera1: [parola1: (
                out += "[" + parola + ": (";

                for (String significato : significati) {
                    // lettera1: [parola1: (significato1; significato2; ...
                    out += significato + ";";
                }

                // lettera1: [parola1: (significato1; significato2; ...),
                out += "), ";
            }
            // lettera1: [parola1: (significato1; significato2; ...), (...)]
            out += "]\n";
        }

        return out;
    }
}
