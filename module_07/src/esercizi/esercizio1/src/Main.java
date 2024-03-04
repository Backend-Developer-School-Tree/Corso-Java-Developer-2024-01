import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Libro> libreria = new ArrayList<>();
        libreria.add(new Libro("Umberto Eco","Il nome della rosa",1980));
        libreria.add(new Libro("Alessandro Manzoni","I Promessi Sposi",1827));
        libreria.add(new Libro("Dante Aligheri","La Divina Commedia",1320));
        libreria.add(new Libro("Roberto Saviano","Libro del 2010",2010));

        System.out.println(libreria);
        Collections.sort(libreria);
        System.out.println(libreria);

        Iterator<Libro> iter = libreria.iterator();
        while(iter.hasNext()){
            Libro tmp = iter.next();
            if(tmp.getAnnoUscita() == 2010){
                System.out.println(tmp);
            }
        }
    }
}