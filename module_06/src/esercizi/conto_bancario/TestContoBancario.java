package esercizi.conto_bancario;

public class TestContoBancario {
    public static void main(String[] args) {
        // Test della prima parte dell'esercizio
        ContoBancario contoBancario1 = new ContoBancario("IT00010101");
        System.out.println("Saldo conto bancario 1: " + contoBancario1.getSaldo());

        Versamento versamento1 = new Versamento(500, contoBancario1);
        versamento1.esegui();
        System.out.println("Saldo conto bancario 1 dopo versamento: " + contoBancario1.getSaldo());

        Prelievo prelievo1 = new Prelievo(700, contoBancario1);
        prelievo1.esegui();
        System.out.println("Saldo conto bancario 1 dopo prelievo: " + contoBancario1.getSaldo());

        Situazione situazione1 = new Situazione(contoBancario1);
        situazione1.esegui();

        SvuotaConto svuotaConto1 = new SvuotaConto(contoBancario1);
        svuotaConto1.esegui();
        System.out.println("Saldo conto bancario 1 dopo svuotamento conto: " + contoBancario1.getSaldo());

        Versamento versamento2 = new Versamento(1000, contoBancario1);
        versamento2.esegui();

        ContoBancario contoBancario2 = new ContoBancario("IT0120120");
        Bonifico bonifico1 = new Bonifico(300, contoBancario1, contoBancario2);
        bonifico1.esegui();
        System.out.println("Saldo conto bancario 1 dopo bonifico a conto bancario 2: " + contoBancario1.getSaldo());
        System.out.println("Saldo conto bancario 2 dopo bonifico da conto bancario 1: " + contoBancario2.getSaldo());
        System.out.println("-----------------------------------");

        // Test dell'evoluzione della classe ContoBancario
        ContoBancario contoBancario3 = new ContoBancario("IT123456");
        contoBancario3.versamento(500);
        contoBancario3.situazione();
        contoBancario3.prelievo(200);
        contoBancario3.situazione();
        contoBancario3.svuotaConto();
        contoBancario3.situazione();
        contoBancario3.versamento(800);
        contoBancario3.situazione();
        ContoBancario contoBancario4 = new ContoBancario("IT567890");
        contoBancario3.bonifico(500, contoBancario4);
        contoBancario3.situazione();
        contoBancario4.situazione();

        System.out.println("\nLista Operazioni effettuate su Conto Bancario " +
                contoBancario3.getIban() + ":\n");
        for (Operazione operazione : contoBancario3.getListaOperazioni()) {
            System.out.println(operazione);
        }
    }
}
