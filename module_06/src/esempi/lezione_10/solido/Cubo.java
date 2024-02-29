package esempi.lezione_10.solido;

public class Cubo extends Solido{
    double lato;
    public Cubo(double ps, double l){
        super(ps);
        lato = l;
    }
    public double volume(){
        return Math.pow(lato,3);
    }
    public double superficie(){
        return lato * lato * 6;
    }

}
