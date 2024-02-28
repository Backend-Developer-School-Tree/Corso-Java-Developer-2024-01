package esempi.lezione_9;

public class Lezione9 {
    public static void main(String[] args) {
        // Pass by value vs. Pass by reference
        int aPrimitivo = 3;
        int bPrimitivo = 7;
        raddoppiaConDatiPrimitivi(aPrimitivo, bPrimitivo);
        System.out.println("a (primitivo) = " + aPrimitivo);
        System.out.println("b (primitivo) = " + bPrimitivo);

        Intero aOggetto = new Intero(3);
        Intero bOggetto = new Intero(7);
        raddoppiaConOggetti(aOggetto, bOggetto);
        System.out.println("a (oggetto) = " + aOggetto);
        System.out.println("b (oggetto) = " + bOggetto);


        // Ciclo "enhanced for"
        int[] arrayInt = { 0, 1, 2, 3, 4 };
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();

        for (int currentInt : arrayInt) {
            System.out.print(currentInt + " ");
        }
        System.out.println();

        System.out.println("---------------------------------");
        Studente studente = new Studente("Mario", "Rossi", 19, "00010203");
        Persona persona1 = studente;
        persona1.sayMyName();
        // persona1.getMatricola(); ==> Non accessibile al momento perché studente assegnato a variabile di tipo Persona

        Professore professore = new Professore("Paolo", "Bianchi", 45, "Geometria", 1);
        Persona persona2 = professore;
        persona2.sayMyName();
        System.out.println("---------------------------------");

        System.out.println(persona1.getClass());
        System.out.println(persona1 instanceof Persona);
        System.out.println(persona1 instanceof Studente);
        System.out.println(persona1 instanceof Professore);

        System.out.println(studente);
        System.out.println(professore);

        System.out.println("Confronto studenti");
        Studente studente2 = new Studente("Luca", "Verdi", 25, "00010203");
        System.out.println(studente.equals(studente2));

        System.out.println("Hashcode studenti");
        System.out.println(studente.hashCode());
        System.out.println(studente2.hashCode());

        System.out.println("Confronto professori");
        Professore professore2 = new Professore("Luca", "Verdi", 25, "Algebra", 1);
        System.out.println(professore.equals(professore2));

        System.out.println("Hashcode professori");
        System.out.println(professore.hashCode());
        System.out.println(professore2.hashCode());
    }

    public static void raddoppiaConDatiPrimitivi(int a, int b) {
        a = a * 2;
        b = b * 2;
    }

    public static void raddoppiaConOggetti(Intero a, Intero b) {
        a.setIntero(a.getIntero() * 2);
        b.setIntero(b.getIntero() * 2);
    }
}
