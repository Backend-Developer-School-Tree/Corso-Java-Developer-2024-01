package esercizi.riparazioni;

public class TestRiparazioni {
    public static void main(String[] args) {
        ListaDiTecnici listaDiTecnici = new ListaDiTecnici(new Tecnico[]{new Tecnico("Mario")});
        listaDiTecnici.add(new Tecnico("Luigi"));
        for (int i = 0; i < listaDiTecnici.length(); i++) {
            System.out.println(listaDiTecnici.get(i));
        }

        ListaDiRiparazioni listaDiRiparazioni = new ListaDiRiparazioni(new Riparazione[]{new Riparazione("Indirizzo test", 1)});
        listaDiRiparazioni.add(new Riparazione("Indirizzo test 2", 2));
        for (int i = 0; i < listaDiRiparazioni.length(); i++) {
            System.out.println(listaDiRiparazioni.get(i));
        }

        Tecnico[] tecnici = {new Tecnico("mario"), new Tecnico("giorgio")};
        Riparazione[] riparazioni = new Riparazione[]{
                new Riparazione("via roma", 4),
                new Riparazione("via milano", 4),
                new Riparazione("via milano2", 4),
                new Riparazione("via milano3", 4),
                new Riparazione("via milan4", 4),
                new Riparazione("via milano5", 4)
        };
        DittaRiparazioni d = new DittaRiparazioni(riparazioni, tecnici);

        System.out.println(d.getRiparazioni());
        System.out.println(d.getRiparazioneMaxPriorita());
        System.out.println(d.assegnaProssimaRiparazione());
        System.out.println(d.assegnaProssimaRiparazione());
        System.out.println(d.getRiparazioneMaxPriorita());
        System.out.println(!d.assegnaProssimaRiparazione());
    }
}
