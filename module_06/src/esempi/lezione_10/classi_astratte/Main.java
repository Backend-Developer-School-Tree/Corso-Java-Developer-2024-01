package esempi.lezione_10.classi_astratte;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gatto gatto = new Gatto();
        //Animale animale = new Animale(); // non si può istanziare
        gatto.test();
        System.out.println(gatto.getNomignolo());
        gatto.changeNomignolo("Gattino");
        System.out.println(gatto.getNomignolo());
        Cane cane = new Cane();
        cane.animalSound();
        cane.scodinzolare();
        System.out.println(cane.nome);
        Cane cane2 = new Cane("marrone");
        System.out.println(cane.getColoreCoda());
        System.out.println(cane2.getColoreCoda());
    }
}