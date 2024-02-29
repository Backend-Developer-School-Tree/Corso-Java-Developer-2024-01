package esempi.lezione_10.classi_astratte;

public class Cane extends Animale {
    private String coloreCoda;
    public Cane(){
        coloreCoda = "nero";
    }
    public Cane(String colore){
        coloreCoda = colore;
    }
    @Override
    public void animalSound(){
        System.out.println("bau");
    }
    public void scodinzolare(){
        System.out.println("Sto scodinzolando! ");

    }
    public String getColoreCoda(){
        return coloreCoda;
    }

}
