package esercizi.esercizio1.src;

public class Libro implements Comparable<Libro>{
    private String autore;
    private String nome;
    private int annoUscita;

    public Libro(String autore, String nome, int annoUscita){
        this.autore = autore;
        this.nome = nome;
        this.annoUscita = annoUscita;
    }
    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(int annoUscita) {
        this.annoUscita = annoUscita;
    }
    @Override
    public String toString(){
        return "Libro: TITOLO= " + nome + ", AUTORE="+autore+ ", ANNO USCITA="+ annoUscita;
    }
    @Override
    public int compareTo(Libro book){
        return this.autore.compareTo(book.autore);
    }
}
