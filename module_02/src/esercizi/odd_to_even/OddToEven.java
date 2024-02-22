package esercizi.odd_to_even;

public class OddToEven {
    public static void main(String[] args) {
        int[] arrayStart = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printIntArray(arrayStart);

        arrayStart = transformArrayToAllEven(arrayStart);
        printIntArray(arrayStart);
    }

    public static int[] transformArrayToAllEven(int[] arrayInput) {
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] % 2 != 0) {
                arrayInput[i] *= 2;
            }
        }
        return arrayInput;
    }

    public static void printIntArray(int[] arrayInput) {
        System.out.print("[");
        for (int i = 0; i < arrayInput.length; i++) {
            System.out.print(arrayInput[i]);
            if (i != arrayInput.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
