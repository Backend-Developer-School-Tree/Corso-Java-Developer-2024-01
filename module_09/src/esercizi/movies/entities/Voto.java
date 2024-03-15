package module_09.src.esercizi.movies.entities;

public enum Voto
{
    UNO(1), DUE(2), TRE(3), QUATTRO(4), CINQUE(5);
    // new Voto(1), new Voto(2), ...
    // UNO, DUE, TRE, QUATTRO, CINQUE;

    int valore;

    Voto(int valore) { this.valore = valore; }

    public int getValore() { return valore; }

    public static void main(String[] args) {
        // Voto voto = new Voto(1);
        // non vogliamo che sia possibile instanziare valori maggiori di 5
        // Voto voto = new Voto(150);
        Voto voto1 = Voto.UNO;
        System.out.println(voto1.getValore());
    }
}
