import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizzBuzzWithMultiplesOf3Should {
    private int inputValue;

    public FizzBuzzWithMultiplesOf3Should(int inputValue){
        this.inputValue = inputValue;
    }

    @Test
    public void printFizz(){
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();

        // Act
        String actual = fizzbuzz.convert(inputValue);

        // Assert
        Assert.assertEquals("Fizz",actual);
    }

    @Parameterized.Parameters
    public static Collection GetNumbers(){
        return Arrays.asList(new Object[]{3,6,9,12,18,21,24,27,33});
    }
}
