package esempi.lezione_10.classi_astratte;

abstract class Animale {
    public String nome = "Animale";
    private String nomignolo;
    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzzz");
    }
    public void changeNomignolo(String nom){
        nomignolo = nom;
    }
    public String getNomignolo(){
        return nomignolo;
    }
}
