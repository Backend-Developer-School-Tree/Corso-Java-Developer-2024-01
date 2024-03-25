package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class EsempiOptional {
    public static void main(String[] args) {

        String test = "ciao";
        Optional optionString = Optional.of(test);

        long test2 = 10;
        Optional optionalLong = Optional.of(test2);

        //String test3  = null;
        //Optional optional3 = Optional.of(test3); ERRORE

        Optional optional3 = Optional.of(Optional.empty());

        User u = new User(1,"lucia");
        Optional optional4 = Optional.of(u);

        String test4 = null;
        Optional optionalNull = Optional.ofNullable(test4);


        optionString.ifPresent(
                s -> System.out.println("****"+s)
        );
        optionString = Optional.empty();
        optionString.ifPresent(s -> System.out.println("-----"+s));

        /*
        optional4.ifPresent(
                s -> System.out.println(s.getName())
        );*/

        System.out.println(optionalLong.get());
        System.out.println(optional4.get());

        User ut = (User) optional4.get();

        User utente2 = new User(1);
        Optional<User> optionauser = Optional.of(utente2);
        optionauser.get().getFirstName().ifPresent( // non lo esegue
                s -> System.out.println(s)
        );

        User utente3 = new User(1, "maria");
        Optional<User> optionauser2 = Optional.of(utente3);
        optionauser2.get().getFirstName().ifPresent(
                s -> System.out.println(s)
        );
        Optional<String> opt = Optional.of("ciao");
        System.out.println(opt.get().toLowerCase());

        Optional opt2 = Optional.of("ciao");
        //System.out.println(opt2.get().toLowerCase());

        Optional<User> utente4 = Optional.of(utente3);
        System.out.println(utente4.get().getName());

        Optional<String> optional5 = Optional.of("test");
        String valoreRitorno = optional5.orElse(getStringRandom());
        System.out.println(valoreRitorno);

        optional5 = Optional.empty();
        valoreRitorno = optional5.orElse(getStringRandom());
        System.out.println(valoreRitorno);

        Optional<Integer> optInt = Optional.of(10);
        Integer valoreRitornoInteger = optInt.orElseGet( () -> 50 );
        System.out.println(valoreRitornoInteger);

        optInt = Optional.empty();
        valoreRitornoInteger = optInt.orElseGet( () -> 50 );
        System.out.println(valoreRitornoInteger);

    }
    private static String getStringRandom(){
        List<String> name = new ArrayList<>();
        name.add("cane");
        name.add("gatto");
        name.add("delfino");
        int index = (int)Math.floor(Math.random() + 2);
        return name.get(index);
    }
}