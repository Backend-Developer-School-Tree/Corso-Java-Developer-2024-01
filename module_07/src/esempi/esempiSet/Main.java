package esempi.esempiSet;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(1);
        hSet.add(3);
        hSet.add(5);
        hSet.add(9);
        hSet.add(10);
        System.out.println(hSet);

        Set<Integer> tSet = new TreeSet<>();
        tSet.add(10);
        tSet.add(1);
        tSet.add(3);
        tSet.add(5);
        tSet.add(9);
        tSet.add(10);
        System.out.println(tSet);

        Set<Integer> hsSet = new LinkedHashSet<>();
        hsSet.add(10);
        hsSet.add(1);
        hsSet.add(3);
        hsSet.add(5);
        hsSet.add(9);
        hsSet.add(10);
        System.out.println(hsSet);

        System.out.println(hsSet.isEmpty()); //verifico se è vuoto
        System.out.println(hsSet);
        System.out.println(hsSet.remove(10));
        System.out.println(hsSet);

        System.out.println(hsSet.contains(3));
        System.out.println(hsSet.contains(300));
        Iterator it = hsSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        hsSet.add(100);
        hsSet.add(300);

        System.out.println(hSet);
        System.out.println(hsSet);
        hSet.addAll(hsSet);
        System.out.println(hSet);

        tSet.addAll(hsSet);
        System.out.println(tSet);
        System.out.println(hsSet);

        System.out.println(tSet.containsAll(hSet)); // true
        System.out.println(hSet);
        System.out.println(hsSet);

        System.out.println(hSet.retainAll(hsSet));
        System.out.println(hSet);

    }
}