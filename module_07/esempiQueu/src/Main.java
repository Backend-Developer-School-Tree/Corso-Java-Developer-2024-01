import java.util.PriorityQueue;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("mela");
        System.out.println(queue);
        queue.add("pera");
        System.out.println(queue);
        queue.add("arancia");
        System.out.println(queue);
        queue.add("mandarino");
        System.out.println(queue);
        queue.add("banana");
        System.out.println("QUEUE:" + queue);

        String rimosso = queue.remove();
        System.out.println("QUEUE:" + queue);
        System.out.println("ELEMENTO RIMOSSO: "+rimosso);

        String peek = queue.peek(); // in testa
        System.out.println("ELEMENTO IN TESTA: "+peek);

        String poll = queue.poll();
        System.out.println(poll);
        System.out.println("RIMUOVO: "+queue);

        queue.offer("kiwi"); // AGGIUNGE
        System.out.println(queue);
        queue.offer("pera"); // AGGIUNGE
        System.out.println(queue);

        System.out.println(queue.offer("kiwi"));

    }
}