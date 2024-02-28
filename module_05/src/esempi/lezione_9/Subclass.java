package esempi.lezione_9;

public class Subclass extends Superclass {
    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }

    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.printMethod();
    }
}
