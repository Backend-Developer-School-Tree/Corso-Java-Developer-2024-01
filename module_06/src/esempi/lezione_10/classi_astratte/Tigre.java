package esempi.lezione_10.classi_astratte;

public class Tigre extends Felino {
    @Override
    public void animalSound(){
        System.out.println("Grrr");
    }
    @Override
    public void graffia(){
        System.out.println("ahia ahia ahia");
    }
    public void doloroso(){
        System.out.println("Il graffio è doloroso!!!");
    }
}
