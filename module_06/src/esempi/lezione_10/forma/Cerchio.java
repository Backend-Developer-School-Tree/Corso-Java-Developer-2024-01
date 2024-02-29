package esempi.lezione_10.forma;

public class Cerchio implements Forma {
    double raggio;
    public Cerchio(double r){
        raggio = r;
    }
    @Override
    public double getArea(){
        return Math.pow(raggio,2)*Math.PI;
    }
    @Override
    public double getPerimetro(){
        return Math.PI * 2 * raggio;
    }
}
