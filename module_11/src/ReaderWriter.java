import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Potrebbe essere anche una classe statica
public class ReaderWriter {

    String filePath; // Dove voglio salvare il mio file

    public ReaderWriter(String filePath){
        this.filePath = filePath;
    }

    public ReaderWriter(Path pathFile) {
        filePath = pathFile.toString(); // Passo da oggetto filePath a Stringa
    }

    public void creaFile() throws IOException {

        // Concatenazione perchè voglio il percorso relativo + il nome del file parametrico
        File newFile = new File(filePath);

        newFile.createNewFile();

    }

    // Voglio andare a scrivere sul file senza fare append

    // Paths class consists exclusively of static methods that return a Path by converting
    // a path string or URI.
    public void writeLine(String line2write){

        // BufferedWriter sa scrivere un buffer di dati
        //
        // Questo modo di scrivere il buffer è per evitare di dover chiudere in maniera
        // esplicita il buffer di scrittura con il bw.close()

        // Con il .write vado a cancellare quello che c'era prima!!!
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(filePath))) {
            bw.write(line2write);
            bw.newLine();

        } catch (IOException ex){
            System.out.println(ex);
        }
    }

    // Potrei ottimizzare i due metodi di scrittura in un solo metodo e usando StandardOpenOption
    // per capire se scrivere da zero o fare append
    public void appendLine(String line2append){
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(filePath), StandardOpenOption.APPEND)) {
            bw.write(line2append);
            bw.newLine();

        } catch (IOException ex){
            System.out.println(ex);
        }
    }

    // void oppure direttamente una stringa
    public void readLines(){
        try (BufferedReader bw = Files.newBufferedReader(Paths.get(filePath))) {
            String line;

            while( (line = bw.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException ex){
            System.out.println(ex);
        }
    }
}