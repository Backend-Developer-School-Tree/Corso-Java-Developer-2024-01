package esempi;

import java.util.Arrays;

public class Lezione4 {
    public static void main(String[] args) {
        // Costrutto if-else
        int a = 4;
        int b = 3;
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("Il massimo tra " + a + " e " + b + " è: "+ max);

        // Costrutto if-else senza parentesi graffe
        if (a > b)
            max = a;
        else
            max = b;
        System.out.println("Il massimo tra " + a + " e " + b + " è: "+ max);

        // Operatore ternario
        max = (a > b) ? a : b;
        System.out.println("Il massimo tra " + a + " e " + b + " è: "+ max);

        // Costrutto if-elseif-else
        int c = 10;
        if (c > 8) {
            System.out.println("c > 8");
        } else if (c > 5) {
            System.out.println("c > 5");
        } else {
            System.out.println("c <= 5");
        }

        // Costrutto switch
        int d = 3;
        switch (d) {
            case 1:
                System.out.println("Risultato switch: d = 1");
                break;
            case 2:
                System.out.println("Risultato switch: d = 2");
                break;
            case 3:
                System.out.println("Risultato switch: d = 3");
                break;
            case 4:
                System.out.println("Risultato switch: d = 4");
                break;
            case 5:
                System.out.println("Risultato switch: d = 5");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Risultato switch: d compreso tra 6 e 8");
                break;
            default:
                System.out.println("Risultato switch: d < 1 oppure d > 8");
                break;
        }

        // Ciclo while(condizione)
        System.out.println("Esecuzione ciclo while:");
        int f1 = 5;
        while (f1 > 0) {
            System.out.println(f1);
            f1--;
        }

        // Ciclo for
        System.out.println("Esecuzione ciclo for:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valore di i corrente: " + i);
        }

        // Piccola parentesi: operatori aritmetici abbreviati
        int j = 4;
        j += 2; // Equivalente a j = j + 2;
        j -= 2; // Equivalente a j = j - 2;
        j *= 2; // Equivalente a j = j * 2;
        j /= 2; // Equivalente a j = j / 2;

        // Ciclo do-while
        System.out.println("Esecuzione ciclo do-while:");
        int e = 0;
        do {
            System.out.println("Valore di e: " + e);
            e += 3;
        } while (e % 2 == 0);

        // continue e break
        System.out.println("Esecuzione ciclo for con continue e break:");
        for (int i = 0; i < 30; i++) {
            if (i < 10) {
                continue;
            }
            if (i > 25) {
                break;
            }
            System.out.println("Valore corrente di i: " + i);
        }

        // Array
        System.out.println("ARRAY");

        int[] arrayInteri = new int[5];
        arrayInteri[0] = 1;
        arrayInteri[1] = 2;
        arrayInteri[2] = 3;
        arrayInteri[3] = 4;
        arrayInteri[4] = 5;

        System.out.println("Elemento 0 in array: " + arrayInteri[0]);
        System.out.println("Elemento 1 in array: " + arrayInteri[1]);
        System.out.println("Elemento 2 in array: " + arrayInteri[2]);
        System.out.println("Elemento 3 in array: " + arrayInteri[3]);
        System.out.println("Elemento 4 in array: " + arrayInteri[4]);
        System.out.println("Lunghezza array: " + arrayInteri.length);

        int arrayInteriForLength = 5;
        int[] arrayInteriFor = new int[arrayInteriForLength];

        // Assegnazione valori all'interno di arrayInteriFor
        for (int i = 0; i < arrayInteriForLength; i++) {
            arrayInteriFor[i] = i + 1;
        }

        // Stampa valori all'interno di arrayInteriFor
        for (int i = 0; i < arrayInteriForLength; i++) {
            System.out.println("Elemento " + i + " in array: " + arrayInteriFor[i]);
        }

        System.out.println(Arrays.toString(arrayInteriFor));

        // Stampa array senza Arrays.toString()
        System.out.print("[");
        for (int i = 0; i < arrayInteriForLength; i++) {
            System.out.print(arrayInteriFor[i]);
            if (i != arrayInteriForLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Sintassi alternative per inizializzazione array
        int[] arrayInteri2 = new int[]{ 1, 2, 3, 4, 5 };
        int[] arrayInteri3 = { 1, 2, 3, 4, 5 };

        // Estensione di un array ad array di dimensione maggiore
        int[] arrayInteriStart = { 1, 2, 3, 4, 5 };
        int[] arrayInteriEnd = new int[10];
        System.out.println(Arrays.toString(arrayInteriEnd));

        for (int i = 0; i < arrayInteriStart.length; i++) {
            arrayInteriEnd[i] = arrayInteriStart[i];
        }
        System.out.println(Arrays.toString(arrayInteriEnd));

        // Array bidimensionali (Matrici)
        System.out.println("MATRICE");
        int[][] matrice = new int[5][10];
        matrice[0][0] = 3;
        matrice[0][1] = 4;
        System.out.println(Arrays.toString(matrice[0]));
        System.out.println(Arrays.toString(matrice[1]));
        System.out.println(Arrays.toString(matrice[2]));
        System.out.println(Arrays.toString(matrice[3]));
        System.out.println(Arrays.toString(matrice[4]));
        System.out.println();

        for (int i = 0; i < matrice.length; i++) {
            for (int z = 0; z < matrice[0].length; z++) {
                matrice[i][z] = 5;
            }
        }
        printMatrice(matrice);
    }

    public static void printMatrice(int[][] matriceDaStampare) {
        for (int i = 0; i < matriceDaStampare.length; i++) {
            System.out.println(Arrays.toString(matriceDaStampare[i]));
        }
    }
}
