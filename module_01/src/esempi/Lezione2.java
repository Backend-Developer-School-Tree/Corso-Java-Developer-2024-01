package esempi;

import java.util.Scanner;

public class Lezione2 {
    public static void main(String[] args) {
        /*
        Commento su linea multipla
        Seconda linea
        Terza linea
         */

        // Scanner per salvare dati in input
        Scanner myScanner = new Scanner(System.in);
        // int intInserted = myScanner.nextInt();
        // System.out.println(intInserted);

        System.out.println("STRING - Metodo equals");

        // Metodi di String
        // Metodo equals(String)
        String s1 = "Stringa 1";
        String s2 = "Stringa 1";
        boolean outputEqualsS1S2 = s1.equals(s2);
        System.out.println("Risultato equals tra '" + s1 + "' e '" + s2 + "': " + outputEqualsS1S2);

        System.out.println("-----------------------------------");
        System.out.println("STRING - Metodo charAt(int)");

        // Metodo charAt(int)
        String s3 = "Provaprovaprova";
        char charOutput = s3.charAt(3);
        System.out.println("Risultato charAt di '" + s3 + "' per la posizione 3: " + charOutput);

        System.out.println("-----------------------------------");
        System.out.println("STRING - Metodo startsWith(String)");

        // Metodo startsWith(String)
        String strToCheck = "ciao come va";
        String prefix1 = "cia";
        String prefix2 = "Cia";
        boolean outputCheck1 = strToCheck.startsWith(prefix1);
        boolean outputCheck2 = strToCheck.startsWith(prefix2);
        System.out.println("Risultato startsWith di '" + strToCheck + "' con prefisso '" + prefix1 + "': " + outputCheck1);
        System.out.println("Risultato startsWith di '" + strToCheck + "' con prefisso '" + prefix2 + "': " + outputCheck2);

        System.out.println("-----------------------------------");
        System.out.println("STRING - Metodi toLowerCase() e toUpperCase()");

        // Metodi toLowerCase() e toUpperCase()
        String lowerAndUpperCase = "BuOnAsErA";
        String outputLower = lowerAndUpperCase.toLowerCase();
        String outputUpper = lowerAndUpperCase.toUpperCase();
        System.out.println("Output lower case di '" + lowerAndUpperCase + ": " + outputLower);
        System.out.println("Output upper case di '" + lowerAndUpperCase + ": " + outputUpper);

        System.out.println("-----------------------------------");
        System.out.println("STRING - Metodo indexOf(String)");

        // Metodo indexOf(String)
        String stringToCheck = "Ehi ciao come va?";
        String stringToSearch = "cia";
        int outputCheckIndex = stringToCheck.indexOf(stringToSearch); // Restituisce l'indice se la trova, oppure -1 se non la trova
        System.out.println("Output check indexOf di '" + stringToSearch + "' nella stringa '" + stringToCheck + "': " + outputCheckIndex);

        System.out.println("-----------------------------------");
        System.out.println("STRING - Metodi replaceFirst(String, String) e replaceAll(String, String)");

        // Metodi replaceFirst(String, String) e replaceAll(String, String)
        String stringToBeReplaced = "Ciao Luca, come stai Luca?";
        String stringToReplace = "Luca";
        String stringReplacement = "Marco";
        String outputReplaceFirst = stringToBeReplaced.replaceFirst(stringToReplace, stringReplacement);
        String outputReplaceAll = stringToBeReplaced.replaceAll(stringToReplace, stringReplacement);
        System.out.println("Output replaceFirst su '" + stringToBeReplaced + "' di '" + stringReplacement + "' al posto di '" + stringToReplace + "': " + outputReplaceFirst);
        System.out.println("Output replaceAll su '" + stringToBeReplaced + "' di '" + stringReplacement + "' al posto di '" + stringToReplace + "': " + outputReplaceAll);

        System.out.println("-----------------------------------");
        System.out.println("OPERATORI - Operatori logici");

        // Operatori logici
        boolean bool1 = true;
        boolean bool2 = false;
        boolean boolOutputOr = bool1 || bool2;
        boolean boolOutputAnd = bool1 && bool2;
        System.out.println("Output di operatore OR tra " + bool1 + " e " + bool2 + ": " + boolOutputOr);
        System.out.println("Output di operatore AND tra " + bool1 + " e " + bool2 + ": " + boolOutputAnd);

        System.out.println("-----------------------------------");
        System.out.println("OPERATORI - Operatori di incremento/decremento");

        // Operatori di incremento/decremento
        int numToIncrement = 6;
        System.out.println("Numero di partenza: " + numToIncrement);
        System.out.println("Numero con post-incremento: " + numToIncrement++);
        System.out.println("Numero attuale: " + numToIncrement);
        System.out.println("Numero con pre-incremento: " + ++numToIncrement);
        System.out.println("Numero attuale: " + numToIncrement);

        System.out.println("-----------------------------------");
        System.out.println("OPERATORI - Operatori relazionali");

        // Operatori relazionali
        int numToCompare1 = 5;
        int numToCompare2 = 3;
        boolean resultEqual = numToCompare1 == numToCompare2;
        boolean resultDifferent = numToCompare1 != numToCompare2;
        boolean resultMaggiore = numToCompare1 > numToCompare2;
        boolean resultMinore = numToCompare1 < numToCompare2;
        boolean resultMaggioreUguale = numToCompare1 >= numToCompare2;
        boolean resultMinoreUguale = numToCompare1 <= numToCompare2;
        System.out.println("Valori da confrontare: " + numToCompare1 + " e " + numToCompare2);
        System.out.println("Risultato operatore ==: " + resultEqual);
        System.out.println("Risultato operatore !=: " + resultDifferent);
        System.out.println("Risultato operatore >: " + resultMaggiore);
        System.out.println("Risultato operatore <: " + resultMinore);
        System.out.println("Risultato operatore >=: " + resultMaggioreUguale);
        System.out.println("Risultato operatore <=: " + resultMinoreUguale);
        // System.out.println("Risultato operatore ==: " + (numToCompare1 == numToCompare2) );
    }
}
