package esempi.lezione_10.compar;

import java.util.Arrays;

/**
 * Supponiamo di avere una classe Dipendenti.
 * Ogni dipendente ha le seguenti proprietà: id, nome, età, salario.
 * Come si effettua l’ordinamento in base all’identificativo ID?
 */

public class Main {
    public static void main(String[] args) {
        Dipendenti[] arrayDipendenti = new Dipendenti[4];
        arrayDipendenti[0] = new Dipendenti(1,"Marta",30,2000);
        arrayDipendenti[1] = new Dipendenti(4,"Luca",45,4000);
        arrayDipendenti[2] = new Dipendenti(3,"Leonardo",20,1150);
        arrayDipendenti[3] = new Dipendenti(2,"Lisa",50,3000);
        System.out.println(Arrays.toString(arrayDipendenti));
        Arrays.sort(arrayDipendenti);
        System.out.println(Arrays.toString(arrayDipendenti));
    }
}