package esercizi.dictionary;

public class MeaningAlreadyExistingException extends RuntimeException {
    public MeaningAlreadyExistingException(String significato, String word) {
        super("Il significato \"" + significato + "\" è già esistente nel dizionario associato alla parola: \"" + word);
    }
}
