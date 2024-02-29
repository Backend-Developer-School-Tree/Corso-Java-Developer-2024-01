package esempi.lezione_10.solido;

public class Sfera extends Solido {
    double raggio;
    public Sfera(double pesos, double r){
        super(pesos);
        raggio = r;
    }
    @Override
    public double volume(){
        return 4/3*Math.PI*Math.pow(raggio,3);
    }
    @Override
    public double superficie(){
        return 4 * Math.PI * Math.pow(raggio,2);
    }
    public String toString(){
        return "Sfera: raggio=" + raggio + ", volume=" + volume() + ", superficie="+superficie();
    }
}
