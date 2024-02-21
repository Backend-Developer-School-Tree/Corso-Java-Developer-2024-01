package esempi;

public class Lezione1 {
    public static void main(String[] args) {
        // Stampa di una stringa a schermo
        System.out.println("Hello World!");

        // Dichiarazione di variabile
        int gear;
        // Assegnazione di variabile
        gear = 1;
        // Inizializzazione (dichiarazione + assegnazione) di variabile
        int gear2 = 2;
        // Stampa di variabili a schermo
        System.out.println("Variabile gear = " + gear);
        System.out.println("Variabile gear2 = " + gear2);

        // Dichiarazione di costante
        final int constant;
        // Assegnazione di costante
        constant = 3;
        // Inizializzazione (dichiarazione + assegnazione) di costante
        final int constant2 = 5;
        // Stampa di costanti a schermo
        System.out.println("Costante constant = " + constant);
        System.out.println("Costante constant2 = " + constant2);

        // Inizializzazione variabile di tipo double
        double numDecimale = 2.3;
        System.out.println("Variabile di tipo double = " + numDecimale);

        // Inizializzazione variabile di tipo String
        String newString = "Ciao come stai";
        System.out.println("Variabile di tipo String: " + newString);

        // Divisione tra variabili di tipo double
        double a = 3;
        double b = 2;
        double c = a/b;
        System.out.println("Divisione tra " + a + " e " + b + " = " + c);

        // Metodi del tipo String
        String s1 = "Ciao a tutti!";
        System.out.println("Metodo length() su stringa " + s1 + ": " + s1.length());
        System.out.println("Metodo substring(0, 4) su stringa "  + s1 + ": " + s1.substring(0, 4));

        // Operatori aritmetici: addizione
        int num1 = 13;
        int num2 = 8;
        int resultAddiction = num1 + num2;
        System.out.println("Operatore addizione tra " + num1 + " e " + num2 + ": " + resultAddiction);

        // Concatenazione stringhe
        String str1 = "Buonasera";
        String str2 = " a ";
        String str3 = "tutti!";
        System.out.println("Concatenazione di stringhe: " + str1 + str2 + str3);

        // Operatori aritmetici: sottrazione
        int num3 = 13;
        int num4 = 8;
        int resultSubtraction = num3 - num4;
        System.out.println("Operatore sottrazione tra " + num3 + " e " + num4 + ": " + resultSubtraction);

        // Operatori aritmetici: prodotto
        int num5 = 5;
        int num6 = 4;
        int resultProduct = num5 * num6;
        System.out.println("Operatore prodotto tra " + num5 + " e " + num6 + ": " + resultProduct);

        // Operatori aritmetici: divisione
        int num7 = 20;
        int num8 = 4;
        int resultDivision = num7 / num8;
        System.out.println("Operatore divisione tra " + num7 + " e " + num6 + ": " + resultDivision);

        // Operatori aritmetici: divisione
        int num9 = 20;
        int num10 = 6;
        int resultRemainder = num9 % num10;
        System.out.println("Operatore resto tra " + num9 + " e " + num10 + ": " + resultRemainder);
    }
}
