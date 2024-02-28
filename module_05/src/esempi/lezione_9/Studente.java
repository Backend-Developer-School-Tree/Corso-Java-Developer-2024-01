package esempi.lezione_9;

public class Studente extends Persona {
    // Attributi
    private String matricola;
    private int votazioneMedia;

    // Costruttore
    public Studente(String nome, String cognome, int eta, String matricola) {
        super(nome, cognome, eta);
        this.matricola = matricola;
        this.votazioneMedia = 0;
    }

    public Studente(String nome, String cognome, int eta, String matricola, int votazioneMedia) {
        this(nome, cognome, eta, matricola);
        this.votazioneMedia = votazioneMedia;
    }

    // Setter
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    // Getter
    public String getMatricola() {
        return this.matricola;
    }

    @Override
    public void sayMyName() {
        super.sayMyName();
        System.out.println("Sono lo studente " + this.getNome() + " " + this.getCognome());
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - Cognome: " + this.getCognome() + " - Età: " + this.getEta() +
                " - Matricola: " + this.getMatricola();
    }

    @Override
    public boolean equals(Object studente) {
        Studente newStudente = (Studente) studente;
        return this.matricola == newStudente.getMatricola();
    }

    @Override
    public int hashCode() {
        return matricola.hashCode();
    }
}
