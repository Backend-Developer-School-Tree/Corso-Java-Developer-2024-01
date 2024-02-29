package esempi.lezione_10.forma;

public class Rettangolo implements Forma{
    private double base;
    private double altezza;
    private double variabileTest;
    public Rettangolo(double b, double a){
        base = b;
        altezza = a;
        variabileTest = Forma.c;
    }
    @Override
    public double getPerimetro(){
        return 2 *base + 2 * altezza;
    }
    @Override
    public double getArea(){
        return base * altezza;
    }
    @Override
    public void stampa(){ //sovrascrivo il metodo stampa
        System.out.println("Stampo");
    }

}
