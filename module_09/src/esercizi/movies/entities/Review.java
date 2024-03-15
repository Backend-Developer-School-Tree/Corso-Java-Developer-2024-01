package module_09.src.esercizi.movies.entities;

public class Review
{
    int id;
    String description;
    // opzioni: 1. enum Voto, 2. classe Voto (con controllo), 3. int (con controllo),
    Voto voto;
}
