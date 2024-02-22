package esercizi.replace_intruder_2;

import java.util.Scanner;

public class ReplaceIntruder2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Inserire una stringa a da rimpiazzare (intruso):");
        String a = myScanner.nextLine();
        System.out.println("Inserire una stringa b che rimpiazzerà l'intruso:");
        String b = myScanner.nextLine();
        System.out.println("Inserire una stringa con almeno due spazi:");
        String c = myScanner.nextLine();

        // c = "a abc bcd cde e"
        // cSplitted = [0: "a", 1: "abc", 2: "bcd", 3: "cde", 4: "e"]
        // for: i = 1 => cSplitted.length - 1 = 5 - 1 = 4
        String[] cSplitted = c.split(" ");
        for (int i = 1; i < cSplitted.length - 1; i++) {
            cSplitted[i] = cSplitted[i].replaceAll(a, b);
        }

        for (int i = 0; i < cSplitted.length; i++) {
            System.out.print(cSplitted[i] + " ");
        }
    }
}
