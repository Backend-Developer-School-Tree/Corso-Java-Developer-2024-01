package esercizi.forme_geometriche;

public class TestFormeGeometriche {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(5);
        quadrato.print();
        System.out.println("Perimetro Quadrato: " + quadrato.getPerimetro());

        Cerchio cerchio = new Cerchio(3);
        System.out.println("Circonferenza Cerchio: " + cerchio.getCirconferenza());
        System.out.println("Area Cerchio: " + cerchio.getArea());
        System.out.println("Colore Cerchio: " + cerchio.getColore());
        cerchio.setColore(new Colore(20, 156, 44));
        System.out.println("Colore Cerchio Aggiornato: " + cerchio.getColore());
    }
}
