# Esercizio Dizionario e Mappa 🛵

1. Scrivere un’interfaccia `Dizionario` dotata dei metodi:
- `Elemento search(Chiave k)`: cerca l’elemento associato alla chiave k nella struttura dati
- `void add(Chiave k, Elemento e)`: aggiunge l’elemento e con chiave k nella struttura dati
- `Elemento delete(Chiave k)`: rimuove l’oggetto associato alla chiave k dalla struttura dati
- `int size()`: restituisce la taglia del dizionario

2. Implementare una coppia (k, e) chiave-elemento, costruita a
partire da una `Chiave` k ed un `Elemento` e ad essa associato
3. Implementare la struttura dati `Mappa` che rappresenta una
collezione di coppie **<u>senza</u> ripetizione** di chiavi
4. Prevedere il sollevamento delle seguenti eccezioni:
- `ElementNotFoundException`: lanciata nel caso la chiave da cercare o rimuovere non è
contenuta nella struttura dati
- `ElementAlreadyContainedException`: lanciata nel caso in cui la chiave da aggiungere
all’insieme sia già contenuta