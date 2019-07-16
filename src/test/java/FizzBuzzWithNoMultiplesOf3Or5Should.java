import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizzBuzzWithNoMultiplesOf3Or5Should {

    private String expectedResult;

    public FizzBuzzWithNoMultiplesOf3Or5Should(String expectedResult){
        this.expectedResult = expectedResult;
    }

    @Test
    public void printTheNumber(){
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();

        // Act
        String actual = fizzbuzz.convert(Integer.valueOf(expectedResult));

        // Assert
        Assert.assertEquals(expectedResult,actual);
    }

    @Parameterized.Parameters
    public static Collection GetNumbers(){
        return Arrays.asList(new Object[]{"1","2","4","7","8","11","13","14"});
    }
}
