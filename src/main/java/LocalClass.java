import java.util.List;

public class LocalClass implements CheckPerson {
    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }


    public boolean test(Person p){
         if(p.gender == Person.Sex.FEMALE &&
                p.getAge() >= 18 &&
                p.getAge() <= 33)
         {return true;}

         return false;
    }

}
