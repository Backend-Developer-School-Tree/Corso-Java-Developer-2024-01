package esercizi.conto_bancario;

public class Versamento extends Operazione {
    public int denaroDaVersare;

    public Versamento(int denaroDaVersare, ContoBancario contoBancario) {
        this.denaroDaVersare = denaroDaVersare;
        this.setContoBancario(contoBancario);
    }

    @Override
    public void esegui() {
        int saldoAttuale = this.getContoBancario().getSaldo();
        this.getContoBancario().setSaldo(saldoAttuale + this.denaroDaVersare);
    }

    @Override
    public String toString() {
        return "Operazione di versamento su conto " + this.getContoBancario().getIban() +
                " della seguente cifra: " + this.denaroDaVersare + "€";
    }
}
