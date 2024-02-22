package esercizi.convert_seconds;

import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire il numero di secondi:");
        int seconds = myScanner.nextInt();
        int minutes = countMinutesFromSeconds(seconds);
        int hours = countHoursFromSeconds(seconds);
        int days = countDaysFromSeconds(seconds);

        System.out.println("Secondi: " + seconds + " - Minuti: " + minutes + " - Ore: " + hours + " - Giorni: " + days);
    }

    public static int countMinutesFromSeconds(int seconds) {
        return seconds / 60;
    }

    public static int countHoursFromSeconds(int seconds) {
        return seconds / (60 * 60);
    }

    public static int countDaysFromSeconds(int seconds) {
        return seconds / (60 * 60 * 24);
    }
}
