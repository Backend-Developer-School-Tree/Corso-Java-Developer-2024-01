import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Scrivere una classe che contenga al suo interno il metodo main, nel quale si dichiari un insieme di interi V=[6,3,1,2,3,1,9] e si calcoli la media.
     * Stampare il risultato della media.
     * Attenzione: gli insiemi non contengono duplicati!
     */
    public static void main(String[] args) {
        //6,3,1,2,3,1,9
        Set<Integer> v = new HashSet<>();
        v.add(6);
        v.add(3);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(1);
        v.add(9);
        System.out.println(v);
        double somma = 0;
        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            //System.out.println(it.next());
            somma += it.next();
        }
        System.out.println(somma);
        int numeroElemento = v.size();
        System.out.println("MEDIA = "+ somma/numeroElemento);
    }
}