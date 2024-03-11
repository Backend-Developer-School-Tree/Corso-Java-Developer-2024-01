package esercizi.dizionario_e_mappa;

public class Elemento<T>
{
    T elemento;

    public Elemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "elemento=" + elemento +
                '}';
    }
}
