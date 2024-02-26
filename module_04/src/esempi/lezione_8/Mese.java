package esempi.lezione_8;

public enum Mese {
    GEN(1), FEB(2), MAR(3), APR(4), MAG(5), GIU(6), LUG(7), AGO(8), SET(9), OTT(10), NOV(11), DIC(12);

    // Attributi
    private int mese;

    Mese(int mese) {
        this.mese = mese;
    }

    public int toInt() {
        return this.mese;
    }
}
