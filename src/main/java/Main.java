import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] arg){
        Person lena = new Person ("Lena", LocalDate.of(1989, Month.JULY,14),
        Person.Sex.FEMALE, "alena.litouka@gmail.com");
        Person marie = new Person ("Marie", LocalDate.of(1990, Month.MAY,17),
                Person.Sex.FEMALE, "mariecurie@gmail.com");
        //lena.printPerson();
        List<Person>list=new ArrayList<>();
        list.add(lena);
        list.add(marie);
        lena.printPersonsOlderThan(list, 60);
    }
}