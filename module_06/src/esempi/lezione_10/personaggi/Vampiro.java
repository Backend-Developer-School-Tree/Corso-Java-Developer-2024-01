package esempi.lezione_10.personaggi;

public class Vampiro implements Mostro {
    int forza;
    public Vampiro(){
        forza = 45;
    }

    @Override
    public void addenta() {
        forza = forza - 2;
    }
    @Override
    public String getForza() {
        return "Forza="+forza;
    }

}
