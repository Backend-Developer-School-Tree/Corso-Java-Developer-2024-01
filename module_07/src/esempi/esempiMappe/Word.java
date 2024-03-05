package esempi.esempiMappe;

import java.util.Arrays;
import java.util.Objects;

public class Word implements Comparable<Word>
{
    Integer index;
    String word;

    @Override
    public String toString() {
        return "Word{" +
                "index=" + index +
                ", word='" + word + '\'' +
                '}';
    }

    public Word(int index, String word) {
        this.index = index;
        this.word = word;
    }

    @Override
    public boolean equals(Object word1) {
        // se this ha lo stesso riferimento in memoria dell'oggetto in input
        if (this == word1) return true;
        // se l'oggetto in input è null o è di una classe diversa
        if (word1 == null || getClass() != word1.getClass()) return false;

        Word w = (Word) word1;
        return word.equals(w.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
        // return Arrays.hashCode(new int[]{index.hashCode(), word.hashCode()});
    }

    @Override
    public int compareTo(Word w) {
        // this > w  --> +1
        // this == w --> 0
        // this < w  --> -1

        int intCmp = Integer.compare(this.index, w.index);

        if (intCmp == 0) return word.compareTo(w.word);
        else return intCmp;
    }
}
