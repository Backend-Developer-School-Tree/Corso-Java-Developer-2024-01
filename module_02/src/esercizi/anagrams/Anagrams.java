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
        int lettersFound = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b.indexOf(a.charAt(i)) != -1) {
                lettersFound++;
            }
        }
        return lettersFound == a.length();
    }
}
