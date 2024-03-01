package esercizi.conto_bancario;

public class SvuotaConto extends Operazione {
    public SvuotaConto(ContoBancario contoBancario) {
        this.setContoBancario(contoBancario);
    }
    @Override
    public void esegui() {
        this.getContoBancario().setSaldo(0);
    }

    @Override
    public String toString() {
        return "Operazione di svuotamento conto " + this.getContoBancario().getIban();
    }
}
