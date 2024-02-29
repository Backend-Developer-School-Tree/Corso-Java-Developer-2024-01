# Battaglia Navale Semplificata 🏍

Scopo dell'esercizio: implementare una versione semplificata del gioco da tavolo "Battaglia Navale" utilizzando Java nel terminale.
Il gioco consiste in un giocatore che affronta il computer.

Regole del gioco:

- Il campo di gioco è una griglia quadrata di dimensioni predefinite (ad esempio, 5x5).
- Il giocatore e il computer hanno ciascuno una singola nave di dimensioni predefinite (ad esempio, 3 celle) da posizionare sulla griglia.
- Le navi possono essere posizionate orizzontalmente o verticalmente, ma non in diagonale.
- A turno, i giocatori cercano di colpire la nave dell'avversario sparando a una cella della griglia.
- Se un colpo colpisce la nave dell'avversario viene contrassegnato come "colpito" (ad esempio con il simbolo 'X'), altrimenti viene contrassegnato come "mancato" (ad esempio con il simbolo 'O').
- La partita termina quando una delle navi viene completamente colpita.
- Viene visualizzato un messaggio finale che indica il vincitore della partita.

Suggerimenti per l'implementazione:

- Utilizzare una matrice per rappresentare la griglia di gioco.
- Nella prima versione, utilizzare posizioni predeterminate quando si crea la matrice.
- Implementare la logica dei turni del giocatore e del computer.
- Visualizzare la griglia di gioco dopo ogni tiro effettuato.
- Determinare il vincitore in base al fatto che la nave dell'avversario sia stata completamente colpita.