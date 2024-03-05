package esempi.esempiGenerici.model;

import esempi.esempiLista.Dipendente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
* LINK UTILI: https://www.baeldung.com/java-instanceof
*
* */

public class Main {

    public static void main(String[] args) throws Exception{
        Person p1 = new Person();
        System.out.println("42" instanceof String);

        if(p1 instanceof Student)
            System.out.println("Sono uno studente");

        if(p1 instanceof Person)
            System.out.println("Sono uno studente");

        List myElements = new ArrayList();

        myElements.add(42);
        myElements.add("42");
        myElements.add(true);

        for (Object obj : myElements){

            if(obj instanceof Integer){
                Integer i = (Integer) obj;
                System.out.println(i);
            }
        }

        List<Integer> myCollectionWithGenerics = new ArrayList<>();
        myCollectionWithGenerics.add(42);

        for(int i=0; i<100; i++){
            myCollectionWithGenerics.add(i);
            // errore a tempo statico perché sto aggiungedo una stringa myCollectionWithGenerics.add("ciao");
        }

        // best practice --> nomi al plurale se abbiamo collezioni
        List<Person> persons = new ArrayList<>();
        persons.add(new Student()); // Student eredita Person, quindi posso aggiungerla
        // errore perché Dipendente non estende persona - persons.add(new Dipendente(0, "Nome", 25, 500.00)); // Student eredita Person, quindi posso aggiungerla

        for (Person p : persons){
            System.out.println(p);

            Student sCasted = (Student) p;
            sCasted.methodOnlyStudent();
        }

        // Container vuole una T,S generici (ricorda NO TIPI PRIMITIVI)
        Container<Integer, String> c1 = new Container<>(0, "S1");

        List<Container<Integer, String>> containers = new ArrayList<>();
        containers.add(c1);
    }
}