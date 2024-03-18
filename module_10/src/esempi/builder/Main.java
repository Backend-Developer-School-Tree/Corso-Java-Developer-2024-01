package esempi.builder;

public class Main
{
    public static void main(String[] args)
    {
        String str = "";
        str = str + "ciao";
        str = str + " come va?";

        System.out.println(str);

        // esempio di classe che implementa il pattern builder per concatenare stringhe
        StringBuilder sb = new StringBuilder();
        sb.append("ciao");
        sb.append(" come va?");         // equivalente dei metodi setter degli attributi
        String str2 = sb.toString();    // equivalente del metodo build() del pattern Builder

        System.out.println(str2);

        // possibile solamente in quanto ogni metodo ritorna "this" (il tipo del builder stesso)
        String str3 = new StringBuilder()
                .append("ciao")
                .append(" come va?")
                .toString();

        System.out.println(str3);
    }
}
