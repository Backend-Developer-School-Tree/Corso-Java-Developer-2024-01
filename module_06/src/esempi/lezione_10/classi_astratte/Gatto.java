package esempi.lezione_10.classi_astratte;

class Gatto extends Felino {
    @Override
    public void animalSound(){
        System.out.println("Miao");
    }
    @Override
    public void graffia(){
        System.out.println("ahia");
    }
    public void test(){
        System.out.println("Test");
    }
}
