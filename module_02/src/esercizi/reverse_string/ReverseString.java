package esercizi.reverse_string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire una stringa: ");
        String s = myScanner.nextLine();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String sReverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sReverse += s.charAt(i);
        }
        return sReverse;
    }
}
