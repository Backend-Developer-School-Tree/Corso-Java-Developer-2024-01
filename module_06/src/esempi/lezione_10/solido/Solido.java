package esempi.lezione_10.solido;

public abstract class Solido {
    double pesoSpecifico;
    public Solido(double ps){
        pesoSpecifico = ps;
    }
    public double peso(){
        return volume() * pesoSpecifico;
    }
    public abstract double volume();
    public abstract double superficie();
}
