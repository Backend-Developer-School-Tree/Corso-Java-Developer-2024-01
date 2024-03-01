package esercizi.conto_bancario;

public class Situazione extends Operazione {
    public Situazione(ContoBancario contoBancario) {
        this.setContoBancario(contoBancario);
    }
    @Override
    public void esegui() {
        System.out.println("Situazione saldo conto IBAN " + this.getContoBancario().getIban() + ": " +
                this.getContoBancario().getSaldo());
    }

    @Override
    public String toString() {
        return "Operazione di visualizzazione situazione su conto " + this.getContoBancario().getIban();
    }
}
