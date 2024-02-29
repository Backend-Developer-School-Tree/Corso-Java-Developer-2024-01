package esempi.lezione_10.solido;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sfera f = new Sfera(3.3, 5);
        System.out.println(f.volume());
        Cubo c = new Cubo(1.5, 5);
        System.out.println(c.volume());
        System.out.println(f);
    }
}