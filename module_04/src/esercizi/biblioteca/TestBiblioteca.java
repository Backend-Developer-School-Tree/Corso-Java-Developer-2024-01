package esercizi.biblioteca;

import java.util.Arrays;

public class TestBiblioteca {
    public static void main(String[] args) {
        int[] values = new int[7];
        values[0] = 123;
        values[1] = 4;
        values[2] = 98;
        values[3] = 33;
        values[4] = 76;
        values[5] = 2;
        values[6] = 235;
        BibliotecaSemplificata biblioteca = new BibliotecaSemplificata(values);
        System.out.println(biblioteca.esisteLibro(76));
        int[] libriOrdinati = biblioteca.getIndiciLibriOrdinati();
        System.out.println(libriOrdinati[0] == 2);
        System.out.println(libriOrdinati[1] == 4);
        System.out.println(libriOrdinati[2] == 33);
        System.out.println(libriOrdinati[3] == 76);
        System.out.println(libriOrdinati[4] == 98);
        System.out.println(libriOrdinati[5] == 123);
        System.out.println(libriOrdinati[6] == 235);

        System.out.println("--------------------------------");

        Libro[] books = new Libro[]{
                new Libro(123, "Luciana Litizzetto", "I dolori del giovane Programmatore"),
                new Libro(2, "Super Mario", "Errori da non ripetere"),
                new Libro(98, "Luigi Pirandino", "Uno, nessuno e diecimila bug"),
                new Libro(33, "Roberto Roberti", "Come programmare in Java da zero"),
                new Libro(76, "Piero Java", "Mille splendidi errori"),
                new Libro(4, "Lavinia Pitoni", "Non si esce vivi dalle biblioteche"),
                new Libro(235, "Luciana Litizzetto Jr.", "I dolori del vecchio Programmatore")
        };
        Biblioteca library = new Biblioteca(books);
        System.out.println(library.esisteLibro(76));
        Libro[] booksInLibrary = library.getLibriOrdinati();
        System.out.println(booksInLibrary[0].getIndice() == 2);
        System.out.println(booksInLibrary[1].getIndice() == 4);
        System.out.println(booksInLibrary[2].getIndice() == 33);
        System.out.println(booksInLibrary[3].getIndice() == 76);
        System.out.println(booksInLibrary[4].getIndice() == 98);
        System.out.println(booksInLibrary[5].getIndice() == 123);
        System.out.println(booksInLibrary[6].getIndice() == 235);
        System.out.println(Arrays.toString(books));
    }
}
