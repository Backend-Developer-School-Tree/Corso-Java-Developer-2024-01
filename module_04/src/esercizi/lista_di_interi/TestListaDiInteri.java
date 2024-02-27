package esercizi.lista_di_interi;

public class TestListaDiInteri {
    public static void main(String[] args) {
        ListaDiInteri lista = new ListaDiInteri();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);
        lista.addAt(5, 1);
        System.out.println(lista);
        lista.remove(5);
        System.out.println(lista);
        lista.pop(1);
        System.out.println(lista);
        /*
        System.out.println(lista.length());
        System.out.println(lista.toString());
        System.out.println(lista.contains(3));
        System.out.println(lista.get(2));
        System.out.println(lista.indexOf(3));
         */
    }
}
