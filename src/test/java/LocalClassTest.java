import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

class LocalClassTest {

    @org.junit.jupiter.api.Test
    @Test
    void test1() {
        //Given
        Person lena = new Person("Lena", LocalDate.of(1949, Month.JULY, 14),
                Person.Sex.FEMALE, "alena.litouka@gmail.com");
        LocalClass localClass = new LocalClass();

        //When
        boolean actual=localClass.test(lena);
        boolean expected=false;

        //Then
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    @Test
    void test2() {
        //Given
        Person lena = new Person("Lena", LocalDate.of(1989, Month.JULY, 14),
                Person.Sex.FEMALE, "alena.litouka@gmail.com");
        LocalClass localClass = new LocalClass();

        //When
        boolean actual=localClass.test(lena);
        boolean expected=true;

        //Then
        Assert.assertEquals(expected, actual);
    }
}