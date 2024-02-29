package esempi.lezione_10.forma;

public interface Forma {
    //private int a = 10; NO
    // protected  int b = 10; NO
    public int c = 10;

    double getPerimetro();
    double getArea();

    private void faiQualcosa(){
        System.out.println("Faccio qualcosa");
    }

    public default void stampa(){
        faiQualcosa();
        System.out.println("Il mio oggetto");
    }
}
