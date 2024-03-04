package esercizi.esercizioRaccolta.src;

public class Main {
    /**
     * Si definisca una classe Canzone i cui oggetti sono costruiti con nome e autore della canzone.
     * Si crei una classe Raccolta che contiene (ovvero i cui oggetti sono costruiti con) un insieme di canzoni.
     * In una prima versione, si utilizzi HashSet per memorizzare l'insieme di canzoni
     * Si implementi correttamente equals e hashCode in modo da evitare duplicati di canzoni sostanzialmente uguali (ovvero con lo stesso nome e autore)
     * La classe è dotata di un metodo toString che restituisce la rappresentazione sotto forma di stringa dell'insieme di canzoni (analogamente, le canzoni sono dotato dello stesso metodo)
     * Si implementi quindi la classe RaccoltaOrdinata che utilizza TreeSet per mantenere un ordine sulle canzoni
     * Implementare un ordine sulle canzoni basato sul nome della canzone e, se questo è uguale, sul nome dell'autore
     *
     */

    public static void main(String[] args) {

        AbstractRaccolta raccolta = new Raccolta();
        populateRaccolta(raccolta); //raccolta HashSet
        System.out.println(raccolta);
        raccolta = new RaccoltaOrdinata();
        populateRaccolta(raccolta); //raccoltaOrdinata TreeSet
        System.out.println(raccolta);

    }

    public static void populateRaccolta(AbstractRaccolta raccolta) {
        raccolta.add(new Song("album1", "Autore1"));
        raccolta.add(new Song("album2", "Autore1"));
        raccolta.add(new Song("album3", "Autore2"));
        raccolta.add(new Song("album10", "Autore3"));
        raccolta.add(new Song("album14", "Autore8"));
        raccolta.add(new Song("album21", "Autore3"));
    }
}