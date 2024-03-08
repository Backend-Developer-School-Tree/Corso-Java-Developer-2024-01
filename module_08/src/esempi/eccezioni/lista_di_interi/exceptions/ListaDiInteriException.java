package esempi.eccezioni.lista_di_interi.exceptions;

public class ListaDiInteriException extends RuntimeException // --> Unchecked
{
    public ListaDiInteriException(String message)
    {
        super(message);
    }

    /*
    public static void main(String[] args) {
        throw new ListaDiInteriException("Errore generico X");
    }
     */
}
