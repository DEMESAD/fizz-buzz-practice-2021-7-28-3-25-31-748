package tdd.fizzbuzz;

public class FizzBuzz {
    String fizz = "Fizz";
    String buzz = "Buzz";
    String fizzBuzz = "FizzBuzz";
    public String countOff(int order) {
        if (order % 3 == 0 && order % 5 == 0){

            return fizzBuzz;
        }
        if (order % 3 == 0) {
            return fizz;
        }
        if (order % 5 == 0) {

            return buzz;
        }
        if (order % 7 == 0) {

            return "Whizz";
        }

        return String.valueOf(order);
    }
}
