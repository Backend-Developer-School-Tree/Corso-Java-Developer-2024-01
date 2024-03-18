package esercizi.my_string_builder;

import java.util.ArrayList;
import java.util.List;

public class MyString
{
    String string = "";

    public MyString(List<String> strings)
    {
        for (String s : strings) { string += s; }
    }

    @Override
    public String toString() { return string; }

    // ci serve per costruire la classe "target" --> MyString (tramite il metodo build)
    public static class Builder
    {
        List<String> strings = new ArrayList<>();

        public Builder() {}

        public Builder(String str)
        {
            // strings.add(str);
            append(str);
        }

        public Builder(char ch)
        {
            // strings.add(str);
            // this(String.valueOf(ch));
            append(ch);
        }

        public Builder append(String str)
        {
            strings.add(str);
            return this;
        }

        public Builder append(char ch)
        {
            // strings.add(String.valueOf(ch));
            // return this;
            return append(String.valueOf(ch));
        }

        public MyString build() { return new MyString(strings); }
    }

    public static void main(String[] args)
    {
        MyString.Builder msb = new MyString.Builder();

        msb.append("ciao ")
                .append("come va?");

        MyString ms = msb.build();
        System.out.println(ms);

        // -------------------------

        msb = new MyString.Builder();

        msb.append("Facilissimo")
                .append(" concatenare")
                .append(" stringhe!");

        String finalString = msb.toString();

        System.out.println(finalString); // "Facilissimo concatenare stringhe!"
        System.out.println(finalString.equals("Facilissimo concatenare stringhe!"));
    }
}
