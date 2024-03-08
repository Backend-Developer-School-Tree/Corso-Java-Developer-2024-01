package esempi.eccezioni.lista_di_interi.exceptions;

import esempi.eccezioni.lista_di_interi.ListaDiInteri;

public class ElementoNonEsistenteException extends ListaDiInteriException
{
    public ElementoNonEsistenteException(int elemento, ListaDiInteri lista) {
        super("Elemento \"" + elemento + "\" non presente nella lista: " + lista.toString());
    }
}
