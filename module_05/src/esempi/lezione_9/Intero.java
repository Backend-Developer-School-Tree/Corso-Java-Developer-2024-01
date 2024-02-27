package esempi.lezione_9;

public class Intero {
    private int num;

    public Intero(int num) {
        this.num = num;
    }

    public void setIntero(int num) {
        this.num = num;
    }

    public int getIntero() {
        return this.num;
    }

    public String toString() {
        return Integer.toString(this.num);
    }
}
