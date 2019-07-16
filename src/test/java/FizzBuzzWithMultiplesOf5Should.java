import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizzBuzzWithMultiplesOf5Should {

    private int inputValue;

    public FizzBuzzWithMultiplesOf5Should(int inputValue) {
        this.inputValue = inputValue;
    }

    @Test
    public void printBuzz() {
        // Arrange
        FizzBuzz fizzbuzz = new FizzBuzz();

        // Act
        String actual = fizzbuzz.convert(inputValue);

        // Assert
        Assert.assertEquals("Buzz", actual);
    }

    @Parameterized.Parameters
    public static Collection GetNumbers() {
        return Arrays.asList(new Object[]{5, 10, 20, 25, 35});
    }

}
