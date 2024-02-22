package esercizi.counter_vowels_consonants;

import java.util.Scanner;

public class CounterVowelsConsonants {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserire una frase:");
        String inputSentence = myScanner.nextLine();

        countVowelsAndConsonantsInSentence(inputSentence);
    }

    public static void countVowelsAndConsonantsInSentence(String inputSentence) {
        String[] sentenceSplit = inputSentence.split(" ");
        for (int i = 0; i < sentenceSplit.length; i++) {
            countVowelsAndConsonantsInWord(sentenceSplit[i]);
        }
    }

    public static void countVowelsAndConsonantsInWord(String inputWord) {
        String inputWordLowercase = inputWord.toLowerCase();
        int countVowels = 0;
        int countConsonants = 0;
        for (int i = 0; i < inputWordLowercase.length(); i++) {
            if (inputWordLowercase.charAt(i) == 'a' || inputWordLowercase.charAt(i) == 'e' || inputWordLowercase.charAt(i) == 'i' ||
                    inputWordLowercase.charAt(i) == 'o' || inputWordLowercase.charAt(i) == 'u') {
                countVowels++;
            } else {
                countConsonants++;
            }
        }
        System.out.println("Numero di vocali nella parola '" + inputWord + "': " + countVowels);
        System.out.println("Numero di consonanti nella parola '" + inputWord + "': " + countConsonants);
    }
}
