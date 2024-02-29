package esempi.lezione_10.personaggi;

public class Eroe implements Umano {
    int forza;
    public Eroe(){
        forza = 30;
    }
    @Override
    public void combatti(){
        forza = forza - 3;
    }
    @Override
    public String getForza(){
        return "Forza dell'eroe= " +forza;
    }

}
