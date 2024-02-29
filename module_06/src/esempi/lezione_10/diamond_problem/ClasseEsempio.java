package esempi.lezione_10.diamond_problem;

public class ClasseEsempio implements  InterfacciaA, InterfacciaB{

    @Override
    public void stampa(){
        //System.out.println("STO IMPLEMENTANDO LA CLASSE");
        InterfacciaB.super.stampa();
        InterfacciaA.super.stampa();

    }

}
