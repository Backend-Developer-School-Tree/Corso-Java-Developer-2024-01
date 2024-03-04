package esercizi.esercizioRaccolta.src;

import java.util.Objects;

public class Song implements Comparable<Song>{
    private String name;
    private String author;

    public Song(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;
        return Objects.equals(name, song.name) && Objects.equals(author, song.author);
    }

    //è un interno
    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Song o) {
        int compareName = getName().compareTo(o.getName());
        if(compareName == 0) { //stesso nome controllo l'autore
            return getAuthor().compareTo(o.getAuthor());
        }
        return compareName;
    }
}
