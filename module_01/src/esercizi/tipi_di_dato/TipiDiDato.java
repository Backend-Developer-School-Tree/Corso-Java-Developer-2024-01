package esercizi.tipi_di_dato;

public class TipiDiDato {
    public static void main(String[] args) {
        /*
        ESERCIZIO "TIPI DI DATO"
        Scrivere un programma Java che:
        - dichiari una variabile byte e le assegni il valore di -2
        - dichiari una variabile short e le assegni il valore di 25
        - dichiari una variabile int e le assegni il valore di 32
        - dichiari una variabile long e le assegni il valore di 255
        - dichiari una variabile float e le assegni il valore di 15,32
        - dichiari una variabile double e le assegni il valore di 254,78
        - dichiari una variabile char e le assegni il valore "A"
        - dichiari una variabile boolean e le assegni il valore "true"
        - stampi a console una scritta del tipo "Valore della variabile x:" concatenata al valore della variabile per ciascuna delle 8 variabili precedentemente definite
         */

        // Inizializzazione variabili (dichiarazione + assegnazione)
        byte varByte = -2;
        short varShort = 25;
        int varInt = 32;
        long varLong = 255;
        float varFloat = 1.32F;
        double varDouble = 254.78;
        char varChar = 'c';
        boolean varBoolean = true;

        // Stampa variabili
        System.out.println("Valore della variabile varByte: " + varByte);
        System.out.println("Valore della variabile varShort: " + varShort);
        System.out.println("Valore della variabile varInt: " + varInt);
        System.out.println("Valore della variabile varLong: " + varLong);
        System.out.println("Valore della variabile varFloat: " + varFloat);
        System.out.println("Valore della variabile varDouble: " + varDouble);
        System.out.println("Valore della variabile varChar: " + varChar);
        System.out.println("Valore della variabile varBoolean: " + varBoolean);
    }
}
