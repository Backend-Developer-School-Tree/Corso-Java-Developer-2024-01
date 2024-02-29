package esempi.lezione_10.forma;

public class Quadrato implements Forma {
    private double lato;

    public Quadrato(double lato){
        this.lato = lato;
    }

    @Override
    public double getArea() {
        return Math.pow(lato,2);
    }
    @Override
    public double getPerimetro(){
        return lato + lato + lato + lato;
    }
}
