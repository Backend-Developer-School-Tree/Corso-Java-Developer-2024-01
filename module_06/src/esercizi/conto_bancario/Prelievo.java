package esercizi.conto_bancario;

public class Prelievo extends Operazione {
    private int denaroDaPrelevare;

    public Prelievo(int denaroDaPrelevare, ContoBancario contoBancario) {
        this.denaroDaPrelevare = denaroDaPrelevare;
        this.setContoBancario(contoBancario);
    }

    @Override
    public void esegui() {
        int saldoAttuale = this.getContoBancario().getSaldo();
        if (saldoAttuale >= this.denaroDaPrelevare) {
            this.getContoBancario().setSaldo(saldoAttuale - this.denaroDaPrelevare);
        } else {
            System.out.println("Impossibile prelevare per saldo insufficiente");
        }
    }

    @Override
    public String toString() {
        return "Operazione di prelievo da conto " + this.getContoBancario().getIban() +
                " della seguente cifra: " + this.denaroDaPrelevare + "€";
    }
}
