package esercizi.area_perimetro_rettangolo;

import java.util.Scanner;

public class AreaPerimetroRettangolo {
    public static void main(String[] args) {
        /*
        ESERCIZIO "AREA E PERIMETRO"
        Scrivere un programma Java che acquisisca da tastiera la base e l'altezza di un rettangolo. Il programma
        deve poi mostrare a schermo il valore dell'area e del perimetro del rettangolo in questione.
         */

        // Prendo i due numeri interi di base e altezza in input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci il valore della base del rettangolo:");
        int base = myScanner.nextInt();
        System.out.println("Inserisci il valore dell'altezza del rettangolo:");
        int height = myScanner.nextInt();

        // Calcolo i valori di area e perimetro del rettangolo
        int area = base * height;
        int perimeter = (base * 2) + (height * 2);

        // Stampo su console i risultati
        System.out.println("Base: " + base + " | Altezza: " + height);
        System.out.println("Area del rettangolo: " + area);
        System.out.println("Perimetro del rettangolo: " + perimeter);
    }
}
