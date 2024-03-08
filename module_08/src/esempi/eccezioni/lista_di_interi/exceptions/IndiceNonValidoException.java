package esempi.eccezioni.lista_di_interi.exceptions;

import esempi.eccezioni.lista_di_interi.ListaDiInteri;

public class IndiceNonValidoException extends ListaDiInteriException // extends RuntimeException (implicitamente)
{
    public IndiceNonValidoException(int indice, ListaDiInteri listaDiInteri)
    {
        super("L'indice \"" + indice + "\" non è valido (minore di zero o superiore alla lunghezza), lunghezza attuale: " + listaDiInteri.length());
    }

    /*
    public static void main(String[] args) {
        throw new IndiceNonValidoException(-1);
    }
     */
}
