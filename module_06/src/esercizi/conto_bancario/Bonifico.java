package esercizi.conto_bancario;

public class Bonifico extends Operazione {
    private int denaroDaSpostare;
    private ContoBancario contoBancarioDestinazione;

    public Bonifico(int denaroDaSpostare, ContoBancario contoBancario, ContoBancario contoBancarioDestinazione) {
        this.denaroDaSpostare = denaroDaSpostare;
        this.setContoBancario(contoBancario);
        this.contoBancarioDestinazione = contoBancarioDestinazione;
    }

    @Override
    public void esegui() {
        int saldoAttualeConto = this.getContoBancario().getSaldo();
        if (saldoAttualeConto >= this.denaroDaSpostare) {
            int saldoAttualeContoDestinazione = this.contoBancarioDestinazione.getSaldo();
            this.getContoBancario().setSaldo(saldoAttualeConto - this.denaroDaSpostare);
            this.contoBancarioDestinazione.setSaldo(saldoAttualeContoDestinazione + this.denaroDaSpostare);
        } else {
            System.out.println("Impossibile effettuare bonifico per saldo insufficiente");
        }
    }

    @Override
    public String toString() {
        return "Operazione di bonifico da conto " + this.getContoBancario().getIban() +
                " a conto " + this.contoBancarioDestinazione.getIban() + " della seguente cifra: " +
                this.denaroDaSpostare + "€";
    }
}
