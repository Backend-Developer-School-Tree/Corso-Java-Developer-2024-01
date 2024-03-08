package esempi.eccezioni;

import java.util.Locale;

public class Main
{
    public static void main(String[] args)
    {
        // Esistono due macro-categorie di eccezioni:
        // - Checked exception                                       --> DEVONO essere gestite (o delegate)
        // - Unchecked exception (Runtime exceptions, Error, etc)    --> possono non essere gestite

        // nel try abbiamo del codice che PUO' generare un'eccezione
        try {
            // in questo caso una indexOutOfBoundException
            scorriArrayConException();
            // tutto quello che c'è dopo il sollevamento di una eccezione NON viene eseguito
            // poiché il programma:
            // 1. termina (se non gestiamo l'eccezione)
            // 2. oppure prosegue direttamente con il blocco catch (e a seguire finally),
            //   ignorando il resto del blocco try

            String a = null;
            a.toLowerCase(Locale.ROOT);
        }
        /*
        catch (RuntimeException e) {
            System.out.println("CATTURO TUTTO");
            System.out.println(e.getMessage());
        }
         */
        catch (ArrayIndexOutOfBoundsException exception) {
            // gestiamo l'eccezione come meglio crediamo
            System.out.println("HAI FATTO UN ERRORE TU!");
            System.out.println(exception.getMessage());
        }
        /*
        catch (NullPointerException e) {
            // gestiamo il caso in cui si generi una NullPointerException
        }
         */
        // altri N blocchi catch ...
        finally {
            System.out.println("IL BLOCCO FINALLY VIENE ESEGUITO SEMPRE");
        }

        System.out.println("IL PROGRAMMA PROSEGUE");

    }

    public static void scorriArrayConException() {
        int[] estrazioneLotto = { 3, 25, 10, 6, 18 };
        for (int i = 0; i <= 5; i++) System.out.println(estrazioneLotto[i]);
    }
}
