package esercizi.die_n_sided;

import java.util.Random;

public class DieNSided {
    public static void main(String[] args) {
        int n = 3;

        // Metodo 1: Math.random()
        int random1 = (int) (Math.random() * n) + 1;
        System.out.println("Valore random con Math.random(): " + random1);

        // Metodo 2: Classe Random e nextInt()
        Random rand = new Random();
        int random2 = 1 + rand.nextInt(n);
        System.out.println("Valore random con classe Random e nextInt(): " + random2);
    }
}
