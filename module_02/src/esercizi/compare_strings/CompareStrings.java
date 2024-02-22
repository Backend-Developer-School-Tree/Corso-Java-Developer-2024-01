package esercizi.compare_strings;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Inserire la prima stringa:");
        String a = myScanner.nextLine().toLowerCase();
        System.out.println("Inserire la seconda stringa:");
        String b = myScanner.nextLine().toLowerCase();
        System.out.println("Inserire la terza stringa:");
        String c = myScanner.nextLine().toLowerCase();

        if (a.equals(b) && b.equals(c)) {
            System.out.println("Il numero di stringhe uguali è 3");
        } else if (a.equals(b) || b.equals(c) || a.equals(c)) {
            System.out.println("Il numero di stringhe uguali è 2");
        } else {
            System.out.println("Non ci sono stringhe uguali tra loro");
        }
    }
}
