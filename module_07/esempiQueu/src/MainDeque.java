import com.sun.security.jgss.GSSUtil;

import java.util.Deque;
import java.util.LinkedList;

public class MainDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();


        deque.add("Elemento 1");
        System.out.println(deque);
        deque.addFirst("Elemento 2");
        System.out.println(deque);
        deque.addLast("Elemento 4");
        System.out.println(deque);

        //deque.add(10); ERRORE
        //deque.addLast(10); ERRORE


        deque.add("Elemento 3");
        System.out.println(deque);

        String elementoTesta = deque.peekFirst();
        System.out.println(elementoTesta);
        System.out.println(deque);

        String elementoCoda = deque.peekLast();
        System.out.println(elementoCoda);
        System.out.println(deque);

        System.out.println(deque.offerFirst("Elemento 10"));
        System.out.println(deque);
        System.out.println(deque.offerLast("Elemento 1"));
        System.out.println(deque);
        System.out.println(deque.offer("Elemento 3"));
        System.out.println(deque);
        //System.out.println(deque.offerFirst(3));
        //System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

    }
}