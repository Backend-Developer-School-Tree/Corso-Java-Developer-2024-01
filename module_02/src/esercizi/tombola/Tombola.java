package esercizi.tombola;

public class Tombola {
    public static void main(String[] args) {
        int[][] card = {
                { 9, 27, 55, 70, 83 },  // Usciti: 27, 55, 70 => TERNO
                { 11, 39, 57, 73, 85 }, // Usciti: 11, 39, 57 => TERNO
                { 5, 18, 34, 41, 62 }   // Usciti: 5, 18, 62 => AMBO
        };

        int[] drawnNumbers = { 12, 27, 62, 55, 80, 11, 39, 57, 83, 5, 18, 54, 90, 13, 70, 77, 8, 19, 67, 40 };
        // int[] drawnNumbers = { 9, 27, 55, 70, 83, 11, 39, 57, 73, 85, 5, 18, 34, 41, 62 }; Caso di Tombola
        System.out.println(findCombinationsInCard(card, drawnNumbers));
    }

    public static String findCombinationsInCard(int[][] matrix, int[] drawnNumbers) {
        int ambi = 0;
        int terni = 0;
        int quaterne = 0;
        int cinquine = 0;
        boolean tombola = true;

        int currentSequence = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (findInArray(drawnNumbers, matrix[i][j])) {
                    currentSequence++;
                } else {
                    switch (currentSequence) {
                        case 2:
                            ambi++;
                            break;
                        case 3:
                            terni++;
                            break;
                        case 4:
                            quaterne++;
                            break;
                        case 5:
                            cinquine++;
                            break;
                    }
                    tombola = false;
                    currentSequence = 0;
                }
            }
            switch (currentSequence) {
                case 2:
                    ambi++;
                    break;
                case 3:
                    terni++;
                    break;
                case 4:
                    quaterne++;
                    break;
                case 5:
                    cinquine++;
                    break;
            }
            currentSequence = 0;
        }
        if (tombola) {
            return "TOMBOLA!";
        } else {
            return "Il giocatore ha totalizzato " + ambi + " ambo/i, " + terni + " terno/i, " + quaterne + " quaterna/e e " +
                    cinquine + " cinquina/e";
        }
    }

    public static boolean findInArray(int[] array, int numToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numToFind) {
                return true;
            }
        }
        return false;
    }
}
