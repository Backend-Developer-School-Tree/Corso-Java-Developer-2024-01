# JustDelivery 

E' stata commissionata la realizzazione di un sistema per gestire un'app di food delivery

Nell'app sono presenti 
gli utenti
i ristoranti
ogni ristorante ha un menu e uno o più tipi di cucina
un utente può fare un ordine da un singolo ristorante scegliendo almeno uno dei prodotti nel menu

### Funzioni base
* Registrazione utente
* Registrazione ristorante
* Inserimento menu del ristorante
* Ricerca dei ristoranti per tipo di cucina
* Stampa del menu su console
* Aggiunta dei prodotti all'ordine
* Stampa del dettaglio dell'ordine (lista prodotti, prezzo totale calcolando le spese di consegna)
* Ottenere lo storico degli ordini di un utente

### Funzioni avanzate
* Ottenere i ristoranti dai quali un utente ha effettuato un ordine, ordinati per quantità di ordini effettuati dall'utente
* Ottenere la cucina più apprezzata dall'utente (se ordino una volta da un ristorante con cucina "cinese" e due volte da un ristorante con cucina "fast food", la cucina più apprezzata da me è "fast food")
* Dato un utente **u**, utilizzando la cucina più apprezzata dall'utente **u**, scegliere un ristorante che ha quel tipo di cucina e dal quale l'utente **u** non ha mai ordinato

## IL VOSTRO COMPITO

1) Progettare il diagramma ER.
2) Costruire un database coerente con il diagramma su pgAdmin (i vincoli non semplici segnalarli
solamente o al massimo implementarli nell’applicazione Java).
3) Scrivere un programma Java che si connette al database ed esegua le funzionalità richieste.