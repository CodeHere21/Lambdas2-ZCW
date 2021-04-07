import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambdaExpressionTest {

    @Test
    void getLambda() {
        //Given
        List<Person> listTest;
        Person marie = new Person("Marie", LocalDate.of(2016, Month.MAY, 17),
                Person.Sex.FEMALE, "mariecurie@gmail.com");

        LambdaExpression lambdaExpression = new LambdaExpression();
        //When

        boolean expected = true;
        boolean actual = lambdaExpression.getLambda().test(marie);
        //Then
        Assert.assertEquals(expected, actual);
    }
}