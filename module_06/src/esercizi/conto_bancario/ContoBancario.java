package esercizi.conto_bancario;

public class ContoBancario {
    // Attributi
    private int saldo;
    private String iban;
    private Operazione[] listaOperazioni;
    private int numOperazioni;

    // Costruttore
    public ContoBancario(String iban) {
        this.saldo = 0;
        this.iban = iban;
        this.listaOperazioni = new Operazione[100];
        this.numOperazioni = 0;
    }

    public ContoBancario(int saldo, String iban) {
        this.saldo = saldo;
        this.iban = iban;
        this.listaOperazioni = new Operazione[100];
        this.numOperazioni = 0;
    }

    // Getter e setter
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Operazione[] getListaOperazioni() {
        Operazione[] listaOperazioni = new Operazione[this.numOperazioni];
        for (int i = 0; i < this.numOperazioni; i++) {
            listaOperazioni[i] = this.listaOperazioni[i];
        }
        return listaOperazioni;
    }

    public void setListaOperazioni(Operazione[] listaOperazioni) {
        this.listaOperazioni = listaOperazioni;
    }

    public void eseguiOperazione(Operazione operazione) {
        operazione.esegui();
        this.listaOperazioni[this.numOperazioni] = operazione;
        this.numOperazioni++;
    }

    // Metodi
    public void eseguiOperazioni(Operazione[] listaOperazioni) {
        for (Operazione operazione : listaOperazioni) {
            this.eseguiOperazione(operazione);
        }
    }

    public void prelievo(int denaroDaPrelevare) {
        Prelievo prelievo = new Prelievo(denaroDaPrelevare, this);
        this.eseguiOperazione(prelievo);
    }

    public void svuotaConto() {
        SvuotaConto svuotaConto = new SvuotaConto(this);
        this.eseguiOperazione(svuotaConto);
    }

    public void versamento(int denaroDaVersare) {
        Versamento versamento = new Versamento(denaroDaVersare, this);
        this.eseguiOperazione(versamento);
    }

    public void situazione() {
        Situazione situazione = new Situazione(this);
        this.eseguiOperazione(situazione);
    }

    public void bonifico(int denaroDaSpostare, ContoBancario contoBancarioDestinazione) {
        Bonifico bonifico = new Bonifico(denaroDaSpostare, this, contoBancarioDestinazione);
        this.eseguiOperazione(bonifico);
    }
}
