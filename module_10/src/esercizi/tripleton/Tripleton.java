package esercizi.tripleton;

public class Tripleton
{
    public static final int MAX_INSTANCES = 3;

    private static final Tripleton[] instances = new Tripleton[MAX_INSTANCES];

    private static int instanceIndex = 0;

    private Tripleton() { /* ... */ }

    public static Tripleton getInstance()
    {
        // if (instances[instanceIndex % MAX_INSTANCES] == null)
        if (instanceIndex < MAX_INSTANCES)
            instances[instanceIndex] = new Tripleton();

        return instances[instanceIndex++ % MAX_INSTANCES];
    }

    public static void main(String[] args)
    {
        // x % 2 --> pari o meno

        // 3 % 3 == 0
        // 4 % 3 == 1
        // 5 % 3 == 2
        // 6 % 3 == 0
    }
}
