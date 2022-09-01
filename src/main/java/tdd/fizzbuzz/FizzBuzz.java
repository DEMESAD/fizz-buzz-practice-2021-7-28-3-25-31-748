package tdd.fizzbuzz;

public class FizzBuzz {
    String fizz = "Fizz";
    String buzz = "Buzz";
    String fizzBuzz = "FizzBuzz";
    public String countOff(int order) {
        if (order % 3 == 0 && order % 5 == 0){

            return fizzBuzz;
        }else if (order % 3 == 0) {
            return fizz;
        } else if (order % 5 == 0) {

            return buzz;
        }
        return String.valueOf(order);
    }
}
