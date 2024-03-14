package model;

public class Film {
    int id;
    String nome;
    String direttore;
    public Film(int id, String nome, String direttore) {
        this.id = id;
        this.nome = nome;
        this.direttore = direttore;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", direttore='" + direttore + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDirettore() {
        return direttore;
    }

    public void setDirettore(String direttore) {
        this.direttore = direttore;
    }
}
