package esercizi.riparazioni;
public class Tecnico {

    private final String nome;
    private Riparazione riparazione;
    private StatoTecnico stato;

    public Tecnico(String nome) {
        this.nome = nome;
        stato = StatoTecnico.DISPONIBILE;
    }

    public String getNome() {
        return nome;
    }

    public Riparazione getRiparazione() {
        return riparazione;
    }

    public void setRiparazione(Riparazione riparazione) {
        this.riparazione = riparazione;

        if (riparazione == null)
            stato = StatoTecnico.DISPONIBILE;
        else
            stato = StatoTecnico.RIPARAZIONE;
    }

    public boolean terminaRiparazione() {
        if (riparazione != null) {
            riparazione.setStato(StatoRiparazione.TERMINATA);
            setRiparazione(null);
            return true;
        }
        return false;
    }

    public StatoTecnico getStato() {
        return stato;
    }

    public void vaiInFerie() {
        this.stato = StatoTecnico.FERIE;
    }

    @Override
    public String toString(){
        return nome+" "+stato;
    }
}
