package esempi.lezione_8;

public class Menu {
    // Attributi
    private String[] options;
    private int optionsCount;

    // Costruttore
    public Menu() {
        options = new String[100];
        optionsCount = 0;
    }

    // Metodi
    public void addOption(String option) {
        this.options[optionsCount] = option;
        this.optionsCount++;
    }

    public void showMenu() {
        for (int i = 0; i < this.optionsCount; i++) {
            System.out.println((i + 1) + ". " + this.options[i]);
        }
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < this.optionsCount; i++) {
            output += this.options[i] + " ";
        }
        return output;
    }
}
