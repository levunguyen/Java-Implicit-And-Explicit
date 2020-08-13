import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person=new Student();
        Person teacher = new Teacher();
        teacher= person;
        person.setName("Hai tan");
         ((Student) person).setClassroom("16T3");
        System.out.println(teacher.getName());
        System.out.println(person.getName()+((Student) person).getClassroom());
    }
}
