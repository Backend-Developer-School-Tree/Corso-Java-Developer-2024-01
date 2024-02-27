package esercizi.riparazioni;

public class DittaRiparazioni {

    private final ListaDiTecnici tecnici = new ListaDiTecnici();
    private final ListaDiRiparazioni riparazioni = new ListaDiRiparazioni();

    public DittaRiparazioni(Riparazione[] riparazioni, Tecnico[] tecnici) {
        for (Tecnico tecnico : tecnici)
            aggiungiTecnico(tecnico);

        for (Riparazione riparazione : riparazioni)
            aggiungiRiparazione(riparazione);
    }

    public ListaDiTecnici getTecnici(){ return tecnici; }

    public ListaDiRiparazioni getRiparazioni() { return riparazioni; }

    public boolean aggiungiRiparazione(Riparazione riparazione) {
        if (esisteRiparazioneDatoIndirizzo(riparazione.getIndirizzo()))
            return false;

        riparazioni.add(riparazione);
        return true;
    }

    public boolean aggiungiTecnico(Tecnico tecnico) {
        if (esisteTecnicoDatoNome(tecnico.getNome()))
            return false;

        tecnici.add(tecnico);
        return true;
    }

    private boolean esisteRiparazioneDatoIndirizzo(String indirizzo) {
        for (int i = 0; i < riparazioni.length(); i++)
            if (riparazioni.get(i).getIndirizzo().equals(indirizzo))
                return true;

        return false;
    }

    private boolean esisteTecnicoDatoNome(String nome) {
        for (int i = 0; i < tecnici.length(); i++)
            if (tecnici.get(i).getNome().equals(nome))
                return true;

        return false;
    }

    public ListaDiRiparazioni getRiparazioniInAttesa() {
        ListaDiRiparazioni riparazioniInAttesa = new ListaDiRiparazioni();

        for (int i = 0; i < riparazioni.length(); i++) {
            if (riparazioni.get(i).getStato() == StatoRiparazione.IN_ATTESA)
                riparazioniInAttesa.add(riparazioni.get(i));
        }

        return riparazioniInAttesa;
    }

    public Riparazione getRiparazioneMaxPriorita() {
        Riparazione riparazioneMaxPriorita = null;
        int maxPriorita = Integer.MIN_VALUE;

        for (int i = 0; i < riparazioni.length(); i++) {
            if (riparazioni.get(i).getStato() == StatoRiparazione.IN_ATTESA) {
                if (riparazioni.get(i).getPriorita() > maxPriorita) {
                    riparazioneMaxPriorita = riparazioni.get(i);
                    maxPriorita = riparazioneMaxPriorita.getPriorita();
                }
            }
        }

        return riparazioneMaxPriorita;
    }

    public boolean assegnaProssimaRiparazione() {
        Tecnico tecnicoProssimaRiparazione = null;
        for (int i = 0; i < tecnici.length(); i++) {
            if (tecnici.get(i).getStato() == StatoTecnico.DISPONIBILE) {
                tecnicoProssimaRiparazione = tecnici.get(i);
                break;
            }
        }

        if (tecnicoProssimaRiparazione == null)
            return false;

        Riparazione riparazioneMaxPriorita = getRiparazioneMaxPriorita();

        tecnicoProssimaRiparazione.setRiparazione(riparazioneMaxPriorita);
        riparazioneMaxPriorita.setStato(StatoRiparazione.IN_CORSO);

        return true;
    }

    public boolean setRiparazioneTerminata(String nomeTecnico) {
        Tecnico tecnico = cercaTecnicoPerNome(nomeTecnico);

        if (tecnico == null)
            return false;

        return tecnico.terminaRiparazione();
    }

    public boolean setRiparazioneTerminata(Tecnico tecnico) {
        return setRiparazioneTerminata(tecnico.getNome());
    }

    private Tecnico cercaTecnicoPerNome(String nomeTecnico) {
        for (int i = 0; i < tecnici.length(); i++) {
            if (tecnici.get(i).getNome().equals(nomeTecnico))
                return tecnici.get(i);
        }

        return null;
    }

    public void mandaTecniciInFerie(ListaDiTecnici tecniciDaMandareInFerie) {
        for (int i = 0; i < tecniciDaMandareInFerie.length(); i++) {
            Tecnico tecnico = cercaTecnicoPerNome(tecniciDaMandareInFerie.get(i).getNome());
            if (tecnico != null) // se il tecnico esiste all'interno della nostra ditta
                // allora lo possiamo mandare in ferie (altrimenti non avrebbe senso farlo)
                tecniciDaMandareInFerie.get(i).vaiInFerie();
        }
    }
}
