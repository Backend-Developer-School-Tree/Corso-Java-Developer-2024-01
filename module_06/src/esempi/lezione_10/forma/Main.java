package esempi.lezione_10.forma;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(10,30);
        System.out.println(r.getArea());
        System.out.println(r.getPerimetro());
        r.stampa();
        Quadrato q = new Quadrato(21);
        System.out.println(q.getArea());
        System.out.println(q.getPerimetro());
        Cerchio c = new Cerchio(2);
        System.out.println(c.getArea());
        System.out.println(c.getPerimetro());
    }
}