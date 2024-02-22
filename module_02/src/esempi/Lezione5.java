package esempi;

import java.util.Random;

public class Lezione5 {
    public static void main(String[] args) {
        // Metodo ricorsivo
        System.out.println("---- METODI RICORSIVI ----");
        int n = 5;
        System.out.println("Chiamata ricorsiva: fattorialeRicorsivo(" + n + ")");
        int nFattoriale = fattorialeRicorsivo(n);
        System.out.println("Fattoriale di " + n + ": " + nFattoriale);

        // Valori randomici
        // Math.random()
        System.out.println("---- VALORI RANDOMICI ----");
        System.out.println("---- MATH.RANDOM() ----");
        double doubleRandom = Math.random();
        boolean boolRandom = (doubleRandom > 0.5);
        System.out.println("Numero double randomico: " + doubleRandom);
        doubleRandom *= 50;
        System.out.println("Numero double randomico: " + doubleRandom);
        int intRandom = (int) doubleRandom;
        System.out.println("Numero int randomico: " + intRandom);
        System.out.println("Valore booleano randomico: " + boolRandom);

        // Classe Random
        System.out.println("---- CLASSE RANDOM ----");
        Random rand = new Random();
        double doubleRandomNew = rand.nextDouble();
        int intRandomNew = rand.nextInt(50);
        boolean boolRandomNew = rand.nextBoolean();
        System.out.println("Numero double randomico: " + doubleRandomNew);
        System.out.println("Numero int randomico: " + intRandomNew);
        System.out.println("Valore booleano randomico: " + boolRandomNew);

        // Valori randomici in intervallo [min, max]
        int min = 34;
        int max = 41;
        int randomValueInRange = min + rand.nextInt(max - min + 1);
        System.out.println("Temperatura corporea randomica: " + randomValueInRange);

        // Valori randomici con distribuzione gaussiana
        int gaussianRandomInt = (int) (37 + rand.nextGaussian());
        System.out.println("Temperatura corporea con distribuzione Gaussiana: " + gaussianRandomInt);

        // Seed di Random
        Random randBySeed = new Random(42);
        int randomValue1 = randBySeed.nextInt();
        int randomValue2 = randBySeed.nextInt();
        System.out.println("Valore randomico 1 da Random partendo da seed 42: " + randomValue1);
        System.out.println("Valore randomico 2 da Random partendo da seed 42: " + randomValue2);
    }

    public static int fattorialeRicorsivo(int n) {
        // Caso base
        if (n == 0) {
            System.out.println("Caso base: return 1");
            return 1;
        }
        // Chiamata ricorsiva
        System.out.println("Chiamata ricorsiva: fattorialeRicorsivo(" + (n - 1) + ")");
        return n * fattorialeRicorsivo(n - 1);
    }
}
