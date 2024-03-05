package esempi.esempiGenerici.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    }
}
