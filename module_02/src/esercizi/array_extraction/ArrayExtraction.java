package esercizi.array_extraction;

import java.util.Random;

public class ArrayExtraction {
    public static void main(String[] args) {
        String[] strArray = { "Davide", "Luca", "Gabriella", "Andrea" };

        // Metodo 1: Math.random()
        int random1 = (int) (Math.random() * strArray.length);
        System.out.println("Nome estratto con Math.random(): " + strArray[random1]);

        // Metodo 2: Classe Random e nextInt()
        Random rand = new Random();
        int random2 = rand.nextInt(strArray.length);
        System.out.println("Nome estratto con classe Random e nextInt(): " + strArray[random2]);

        // Metodo 3: Probabilità non omogenea
        double random3 = rand.nextDouble();
        if (random3 < 0.5) {
            // Davide per il 50% dei casi
            System.out.println("Nome estratto con distribuzione non omogenea: Davide");
        } else if (random3 < 0.75) {
            // Luca per il 25% dei casi
            System.out.println("Nome estratto con distribuzione non omogenea: Luca");
        } else if (random3 < 0.9) {
            // Gabriella per il 15% dei casi
            System.out.println("Nome estratto con distribuzione non omogenea: Gabriella");
        } else {
            // Andrea per il 10% dei casi
            System.out.println("Nome estratto con distribuzione non omogenea: Andrea");
        }
    }
}
