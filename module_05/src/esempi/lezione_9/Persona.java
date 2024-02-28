package esempi.lezione_9;

public class Persona {
    // Attributi
    private String nome;
    private String cognome;
    private int eta;

    // Costruttore
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // Getter
    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getEta() {
        return this.eta;
    }

    // Metodi
    public void sayMyName() {
        System.out.println("Sono una persona");
    }
}
