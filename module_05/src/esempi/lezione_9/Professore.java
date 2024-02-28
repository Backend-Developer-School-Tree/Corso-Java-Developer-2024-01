package esempi.lezione_9;

import java.util.Objects;

public class Professore extends Persona {
    // Attributi
    private String corso;
    private int idProfessore;

    // Costruttore
    public Professore(String nome, String cognome, int eta, String corso, int idProfessore) {
        super(nome, cognome, eta);
        this.corso = corso;
        this.idProfessore = idProfessore;
    }

    // Setter
    public void setCorso(String corso) {
        this.corso = corso;
    }

    public void setIdProfessore(int idProfessore) {
        this.idProfessore = idProfessore;
    }

    // Getter
    public String getCorso() {
        return this.corso;
    }

    public int getIdProfessore() {
        return this.idProfessore;
    }

    // Metodi

    @Override
    public void sayMyName() {
        super.sayMyName();
        System.out.println("Sono il professor " + this.getNome() + " " + this.getCognome());
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - Cognome: " + this.getCognome() + " - Età: " + this.getEta() +
                " - Corso: " + this.getCorso();
    }

    @Override
    public boolean equals(Object professore) {
        Professore newProfessore = (Professore) professore;
        return this.idProfessore == newProfessore.getIdProfessore();
    }

    @Override
    public int hashCode() {
        return idProfessore;
    }
}
