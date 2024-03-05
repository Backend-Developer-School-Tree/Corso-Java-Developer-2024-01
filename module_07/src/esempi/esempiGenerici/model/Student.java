package esempi.esempiGenerici.model;

public class Student extends Person {

    public void methodOnlyStudent(){
        System.out.println("I am a Student");
    }

    @Override
    public String toString(){
        return "Student []";
    }
}