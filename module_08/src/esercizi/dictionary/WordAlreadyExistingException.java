package esercizi.dictionary;

public class WordAlreadyExistingException extends RuntimeException {
    public WordAlreadyExistingException(String word){
        super("La parola " + word + " è già esiste");
    }
}
