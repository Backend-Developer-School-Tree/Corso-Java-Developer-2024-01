package esercizi.anagrams;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Inserire la prima stringa:");
        String a = myScanner.nextLine();
        String aLowerCase = a.toLowerCase();
        System.out.println("Inserire la seconda stringa:");
        String b = myScanner.nextLine();
        String bLowerCase = b.toLowerCase();

        boolean outputAnagrams = areAnagrams(aLowerCase, bLowerCase);
        if (outputAnagrams) {
            System.out.println("Le due parole sono anagrammi!");
        } else {
            System.out.println("Le due parole NON sono anagrammi!");
        }
    }

    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int currentLetterIndex;
        for (int i = 0; i < a.length(); i++) {
            currentLetterIndex = b.indexOf((a.charAt(i)));
            if (currentLetterIndex == 0) {
                b = b.substring(1);
            } else if (currentLetterIndex > 0 && currentLetterIndex < b.length() - 1) {
                b = b.substring(0, currentLetterIndex) + b.substring(currentLetterIndex + 1, b.length());
            } else if (currentLetterIndex == b.length() - 1) {
                b = b.substring(0, b.length() - 1);
            }
        }
        return b.length() == 0;
    }
}
