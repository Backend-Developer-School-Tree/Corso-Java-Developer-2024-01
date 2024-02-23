package esercizi.counter_occurrences;

import java.util.Scanner;

public class CounterOccurrences {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire il carattere a: ");
        char a = myScanner.nextLine().charAt(0);
        System.out.println("Inserire la stringa b: ");
        String b = myScanner.nextLine();
        int occurrences = countOccurrences(a, b);
        System.out.println("Rilevate " + occurrences + " occorrenze di '" + a + "' in '" + b + "'");
    }

    public static int countOccurrences(char a, String b) {
        int counter = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == a) {
                counter++;
            }
        }
        return counter;
    }
}
