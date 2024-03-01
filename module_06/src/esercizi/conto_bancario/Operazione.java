package esercizi.conto_bancario;

public abstract class Operazione {
    ContoBancario contoBancario;
    public abstract void esegui();

    public ContoBancario getContoBancario() {
        return this.contoBancario;
    }

    public void setContoBancario(ContoBancario contoBancario) {
        this.contoBancario = contoBancario;
    }
}
