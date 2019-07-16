public class FizzBuzz {
    public String convert(int value) {
        String result = "";

        if(value%3 == 0)
            result+= "Fizz";

        if(value%5 == 0)
            result+="Buzz";

        if(!result.isEmpty())
            return result;
        
        return String.valueOf(value);
    }
}
