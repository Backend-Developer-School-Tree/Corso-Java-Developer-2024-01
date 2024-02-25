package esercizi.perfect_numbers;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.print("[ ");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.print("]");
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return n == sum;
    }
}
