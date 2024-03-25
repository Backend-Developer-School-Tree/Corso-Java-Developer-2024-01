package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class EsempiLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("luca","francesco","pino");
        // PRIMA DI JAVA 8
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);
        // DA JAVA 8
        Collections.sort(names, (a,b) -> b.compareTo(a));

        for(String s : names){
            System.out.println(s);
        }
        names.forEach( s-> System.out.println(s) );
        names.forEach( s -> {
            System.out.println(s);
            String s1 = s.concat("ciao");
            System.out.println(s1);
        });

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",100);
        map.put("b",200);
        map.put("c",300);
        map.put("d",400);
        map.put("e",500);

        int k1 = map.get("a");
        System.out.println(k1);
        //int k2 = map.get("g");
        int k2 = map.getOrDefault("a", 1000);
        System.out.println(k2);
        int k3 = map.getOrDefault("g",1000);
        System.out.println(k3);

        map.forEach((key,val) -> System.out.println(key+"::"+val));
        map.forEach( (a,b) -> System.out.println(a+"::"+b));

        User s1 = new User(1,"mirco");
        User s2 = new User(2,"luana");
        User s3 = new User(3,"fido");
        User s4 = new User(4,"pluto");
        List<User> users = new ArrayList<>();
        users.add(s1);
        users.add(s2);
        users.add(s3);
        users.add(s4);

        users.forEach(u -> System.out.println(u.getId() +" _ "+ u.getName()));
        users.forEach(u -> {
            System.out.println(u.getId() +" _ "+ u.getName());
            u.setName("verdi");
            //return u;
        });
        users.forEach(u -> System.out.println(u.getId() +" _ "+ u.getName()));
    }
    private static void esempilamda(){
        /*StringProcessor sp = (s) -> s.toLowerCase();
        System.out.println(sp.process("MONDO"));
        System.out.println(sp.process("CIao"));*/

        StringProcessor2 sp2 = (s1,s2) -> s2.concat(s1);
        System.out.println(sp2.process("Ciao","Mondo"));
        System.out.println(sp2.process("Ciao1","Mondo"));
        System.out.println(sp2.process("Ciao2","Mondo"));
        System.out.println(sp2.process("Ciao3","Mondo"));
        System.out.println(sp2.process("Ciao4","Mondo"));
        System.out.println(sp2.process("Ciao5","Mondo"));

        StringProcessor3 sp3 = (s1) -> System.out.println(10);
        sp3.process("ciao");

        StringProcessor sp = (s) -> {
            String s1 = s.toLowerCase();
            String s2 = s1.concat(s1);
            return s2;
        };
        System.out.println(sp.process("MONDO"));
        System.out.println(sp.process("CIao"));

        StringProcessor4 sp4 = (s1,s2) -> s1.concat(s2+"");
        System.out.println(sp4.process("ciao",4));
    }
    @FunctionalInterface
    public interface StringProcessor {
        String process(String s);
    }
    @FunctionalInterface
    public interface StringProcessor2 {
        String process(String s, String s1);
    }
    @FunctionalInterface
    public interface StringProcessor3{
        void process(String a);
    }
    @FunctionalInterface
    public interface StringProcessor4{
        String process(String a, int b);
    }
}