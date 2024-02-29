package esempi.lezione_10.personaggi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Eroe e = new Eroe();
        Vampiro v = new Vampiro();
        LupoMannaro l = new LupoMannaro(false);

        for(int i = 0; i < 3; i++){
            e.combatti();
        }
        v.addenta();
        l.addenta();
        l.addenta();

        System.out.println(e.getForza());
        System.out.println(v.getForza());
        System.out.println(l.getForza());

    }
}