package esempi.esempiMappe;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Map<Integer, String> integerStringMap = new HashMap<>();
        Map<Integer, String> integerStringMap2 = new TreeMap<>();
        Map<Integer, String> integerStringMap3 = new LinkedHashMap<>();

        // HashMap
        integerStringMap.put(15, "quindici");
        integerStringMap.put(25, "venticinque");
        integerStringMap.put(3, "tre");

        // TreeMap
        integerStringMap2.put(15, "quindici");
        integerStringMap2.put(25, "venticinque");
        integerStringMap2.put(3, "tre");

        // LinkedHashMap
        integerStringMap3.put(15, "quindici");
        integerStringMap3.put(25, "venticinque");
        integerStringMap3.put(3, "tre");

        System.out.println(integerStringMap);
        System.out.println(integerStringMap2);
        System.out.println(integerStringMap3);

        // containsKey torna false se la chiave non è presente nella mappa
        System.out.println(integerStringMap.containsKey(20));
        System.out.println(integerStringMap.get(20));
        System.out.println(integerStringMap.containsKey(15));
        System.out.println(integerStringMap.get(15));

        // le chiavi sono un Set di valori
        System.out.println(integerStringMap.keySet()); // HashMap --> HashSet
        // i valori sono una Collection (lista)
        System.out.println(integerStringMap.values());

        for (Integer key : integerStringMap.keySet())
        {
            System.out.println(key);
            System.out.println(integerStringMap.get(key));
        }

        for (String value : integerStringMap.values())
        {
            System.out.println(value);
        }

        // for sulle coppie (chiave, valore)
        for (Map.Entry<Integer, String> entry : integerStringMap.entrySet())
        {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key);
            System.out.println(value);
            System.out.println(integerStringMap.get(key));
        }



        // Esempio con utilizzo di una classe da noi definita come chiave

        Set<Word> set = new HashSet<>();
        set.add(new Word(1, "ciao"));
        set.add(new Word(2, "ciao"));
        System.out.println(set);

        Map<Word, String> map = new HashMap<>();
        Map<Word, String> map2 = new TreeMap<>();
        Map<Word, String> map3 = new LinkedHashMap<>();

        Comparator<Word> cmp2 = new WordComparator();
        Comparator<Word> cmp = new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.word.compareTo(o2.word);
            }
        };

        new TreeMap<Word, String>();    // ordinamento in base al Comparable
        new TreeMap<Word, String>(cmp); // ordinamento in base al Comparator
    }

}
