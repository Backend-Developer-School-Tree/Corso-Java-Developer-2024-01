package esercizi.stack_overflow;

public class StackOverflow {
    public static void main(String[] args) {
        stackOverflow(1);
    }

    public static int stackOverflow(int i) {
        return stackOverflow(i + 1);
    }
}
