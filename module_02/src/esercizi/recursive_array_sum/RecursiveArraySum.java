package esercizi.recursive_array_sum;

public class RecursiveArraySum {
    public static void main(String[] args) {
        int[] arrayToSum = { 1, 2, 3, 4, 5 };
        int resultSumArray = arrayRecursiveSum(arrayToSum, 0);
        System.out.println(resultSumArray);
    }

    public static int arrayRecursiveSum(int[] arrayToSum, int currentIndex) {
        if (currentIndex == arrayToSum.length - 1) {
            return arrayToSum[currentIndex];
        }
        return arrayToSum[currentIndex] + arrayRecursiveSum(arrayToSum, currentIndex + 1);
    }
}
