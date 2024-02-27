package esercizi.contatore;

public class TestContatore {
    public static void main(String[] args) {
        Contatore contatore = new Contatore();
        System.out.println("Valore iniziale contatore: " + contatore.getContatore());
        contatore.incrementa();
        contatore.incrementa();
        contatore.incrementa();
        System.out.println("Valore contatore: " + contatore.getContatore());
        contatore.reset();
        System.out.println("Valore contatore: " + contatore.getContatore());
        contatore.reset(12);
        System.out.println("Valore contatore: " + contatore.getContatore());
    }
}
