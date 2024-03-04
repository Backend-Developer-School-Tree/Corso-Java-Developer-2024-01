import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        //l1 = new LinkedList<>();
        l1.add(10);
        System.out.println(l1);
        l1.add(31);
        System.out.println(l1);

        List<Double> l2 = new ArrayList<>();
        for(int i = 0; i<10; i++){
            l2.add(Math.random());
        }

        System.out.println(l2);
        l1.add(10);
        System.out.println(l1);

        List<String> l3 = new ArrayList<>();
        l3.add(0,"Gatto");
        l3.add(1,"Cane");
        System.out.println(l3);

        System.out.println(l3.get(0));
        System.out.println(l1.get(1));
        //System.out.println(l1.get(10)); ERRORE
        System.out.println(l3.size());
        for(int i = 0; i < l3.size(); i++){
            System.out.println(l3.get(i));
        }
        System.out.println("L1: "+ l1);
        System.out.println("INDEX DI 10: "+ l1.indexOf(31));

        System.out.println("L3"+l3);
        System.out.println("INDEX DI Gatto: " + l3.indexOf("Gatto"));
        System.out.println("INDEX DI Gatto: " + l3.indexOf("gatto"));

        System.out.println(l1.size());
        l1.remove(0);
        System.out.println(l1);
        System.out.println(l1.size());

        l1.add(31);
        l1.add(54);
        l1.add(36);
        l1.add(71);

        System.out.println(l1);
        System.out.println("SUBLIST:" + l1.subList(0,4));
        System.out.println("SUBLIST:" + l1.subList(1,4));
        //System.out.println("SUBLIST" + l1.subList(0,100)); ERRORE

        System.out.println(l1);
        l1.set(0,100);
        System.out.println(l1);
        l1.set(l1.size()-1,1000);
        System.out.println(l1);

        for(int i = 0; i < l1.size(); i++){
            l1.set(i,l1.get(i)*2);
        }
        System.out.println(l1);
        System.out.println("START ITERATOR");
        Iterator<Integer> it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<Dipendente> listaDipendente = new ArrayList<>();
        listaDipendente.add(new Dipendente(4,"Manuele",30, 3000));
        listaDipendente.add(new Dipendente(3,"Mirko",20, 2000));
        listaDipendente.add(new Dipendente(2,"Franco",50, 4000));
        listaDipendente.add(new Dipendente(1,"Lucia",60, 6000));
        System.out.println(listaDipendente);
        Iterator<Dipendente> iter = listaDipendente.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Collections.sort(listaDipendente);
        System.out.println(listaDipendente);

        //List.of
        List<String> listaImmutabile = List.of("mela","kiwi","pera");
        System.out.println(listaImmutabile);
        //listaImmutabile.set(0,"mandarino");

        //Arrays.asList
        List<String> lista2 = Arrays.asList("mela","kiwi","pera"); //dimensioni fisse
        System.out.println(lista2);
        lista2.set(0,"mandarino");
        System.out.println(lista2);
        //lista2.add("test"); DIMENSIONI FISSE


        if(listaDipendente.get(0) == listaDipendente.get(0)){
            System.out.println("SONO UGUALI");
        }else{
            System.out.println("SONO DIVERSI");
        }
    }
}