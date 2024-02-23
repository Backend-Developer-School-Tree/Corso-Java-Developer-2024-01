package esercizi.palindrome;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire una stringa: ");
        String s = myScanner.nextLine();

        if (checkPalindrome(s)) {
            System.out.println("La stringa è palindroma");
        } else {
            System.out.println("La stringa NON è palindroma");
        }
    }

    public static boolean checkPalindrome(String str) {
        int strLength = str.length();
        for (int i = 0; i < (strLength / 2); i++) {
            if (str.charAt(i) != str.charAt(strLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
