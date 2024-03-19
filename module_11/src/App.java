import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args){
        System.out.println("**** APPLICATION STARTUP *****");
        String fileName = "myFile.txt";

        // Modo alternativo di passare il percorso del file
        //ReaderWriter rw = new ReaderWriter("module_11/src/");

        // Modo alternativo di esplicitare il percorso
        Path path = Paths.get("module_11", "src", fileName);
        ReaderWriter rw = new ReaderWriter(path);

        try {
            rw.creaFile();
            rw.writeLine("INTESTAZIONE: ");

            for(int i=0; i<10; i++){
                rw.appendLine("Riga: " + i);
            }

            rw.readLines();

        } catch (IOException e) {
            System.out.println("**** IOException!! *****");

            // Rilancio l'eccezione manualmente
            // throw new RuntimeException(e);
        }

        System.out.println("**** APPLICATION ENDS *****");
    }
}
