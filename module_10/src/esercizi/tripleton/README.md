# Tripleton 🛴

Realizzare una classe `Tripleton` che può avere fino a 3 istanze in memoria.

Definire un ordine di assegnazione delle istanze a piacere, ad esempio ad ogni chiamata del metodo `getIstance()`
possiamo semplicemente ritornare una diversa istanza nell'ordine "1, 2, 3":

- 1° chiamata `getIstance()`: istanza 1
- 2° chiamata `getIstance()`: istanza 2
- 3° chiamata `getIstance()`: istanza 3
- 4° chiamata `getIstance()`: istanza 1
- 5° chiamata `getIstance()`: istanza 2
- 6° chiamata `getIstance()`: istanza 3
- 7° chiamata `getIstance()`: istanza 1
- ...

Testare il codice, verificando che non possano esistere più di 3 istanze diverse di quella classe
e che la politica di assegnazione sia sempre rispettata.
