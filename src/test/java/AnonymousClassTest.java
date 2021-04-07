import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnonymousClassTest {
    private static List<Person> listTest;
    @BeforeEach
    void setUp() {
        listTest=new ArrayList<>();
        listTest.add(new Person("Lena", LocalDate.of(1949, Month.JULY, 14),
                        Person.Sex.FEMALE, "alena.litouka@gmail.com"));
        listTest.add(new Person("Marie", LocalDate.of(1964, Month.MAY, 17),
                Person.Sex.FEMALE, "mariecurie@gmail.com"));
    listTest.add(new Person("Lida", LocalDate.of(1999, Month.JULY, 17),
            Person.Sex.FEMALE, "lida.litouka@gmail.com"));


    }
    @org.junit.jupiter.api.Test
    @Test
    void test1() {

        //Given
        AnonymousClass anonymousClass = new AnonymousClass();

        //When
        ArrayList<Person> output = anonymousClass.printPersons(listTest);
        Integer expected = 3;
        Integer actual = output.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

}