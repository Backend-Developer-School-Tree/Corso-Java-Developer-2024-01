package esempi.lezione_11;

public class Lezione11 {
    public static void main(String[] args) {
        // Classi nidificate/interne
        char[] caratteriTasti = { 'q', 'w', 'e', 'r', 't', 'y' };
        Tastiera tastiera = new Tastiera("qwerty", caratteriTasti);
        System.out.println("Tipo tastiera: " + tastiera.getTipo());

        Tastiera.Tasto[] tasti = tastiera.getTasti();
        // Enhanced for => Versione semplificata di for da utilizzare per scorrere per intero un array
        for (Tastiera.Tasto tasto : tasti) {
            System.out.print(tasto.premi() + " ");
        }
        System.out.println();

        // Classe anonima
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("ciao");
            }
        };

        r.run();
        r.run();
    }
}
