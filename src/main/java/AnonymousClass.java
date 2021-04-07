import java.util.ArrayList;
import java.util.List;

public class AnonymousClass {
    ArrayList<Person> personList = new ArrayList<>();

    public AnonymousClass() {
    }

    public ArrayList<Person> printPersons(List<Person> roster) {
        ArrayList<Person> temp = new ArrayList<>();
        CheckPerson tester = new CheckPerson() {
            @Override
            public boolean test(Person p) {
                if (p.getAge() > 10 && p.gender == Person.Sex.FEMALE) {
                    return true;
                }
                return false;
            }
        };
        for (Person p : roster) {
            if (tester.test(p)) {
                temp.add(p);
                System.out.println(p.printPerson());
            }
        }
        return temp;
    }
}
