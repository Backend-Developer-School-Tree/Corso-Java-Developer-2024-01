package esempi.lezione_11;

public class Tastiera {
    // Attributi
    private String tipo;
    private Tasto[] tasti;

    public class Tasto {
        // Attributi
        private char c;

        // Costruttore
        public Tasto(char c) {
            this.c = c;
        }

        public char premi() {
            return this.c;
        }

        public String getTipoTastiera() {
            return Tastiera.this.tipo;
        }
    }

    // Costruttore
    public Tastiera(String tipo, char[] tasti) {
        this.tipo = tipo;
        this.tasti = new Tasto[tasti.length];
        for (int i = 0; i < tasti.length; i++) {
            this.tasti[i] = new Tasto(tasti[i]);
        }
    }

    public String getTipo() {
        return this.tipo;
    }

    public Tasto[] getTasti() {
        return this.tasti;
    }
}
