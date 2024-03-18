package esercizi.my_string_builder;

/**
 * La classe `MyStringBuilder` dovrà implementare almeno:
 * - la possibilità di creare un'istanza a partire da una stringa, da un carattere o partendo da zero
 * - un metodo `append` che consenta di aggiungere una stringa o un carattere all'istanza attuale
 * - un metodo `toString` che si occupi di restituire la stringa completa
 */
public class MyStringBuilder
{
    // la classe che vogliamo creare tramite il pattern Builder già esiste (String)
    private String str;

    public MyStringBuilder() { str = ""; }                              // new MyStringBuilder()

    public MyStringBuilder(String str) { this.str = str; }              // new MyStringBuilder("ciao")

    public MyStringBuilder(char ch) { this.str = String.valueOf(ch); }  // new MyStringBuilder('a')

    public MyStringBuilder append(String str)
    {
        this.str += str;
        return this;
    }

    public MyStringBuilder append(char ch)  { return append(String.valueOf(ch)); }

    public String build() { return str; }

    @Override
    public String toString() { return build(); }

    public static void main(String[] args)
    {
        MyStringBuilder msb = new MyStringBuilder();
        new MyStringBuilder("ciao");
        new MyStringBuilder('a');

        msb = new MyStringBuilder()
                .append("ciao")
                .append(" come va?");

        msb.append(' ');
        msb.append("ciao");

        System.out.println(msb.toString());
    }
}
