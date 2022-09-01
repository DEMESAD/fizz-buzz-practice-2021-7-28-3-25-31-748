package tdd.fizzbuzz;

public class FizzBuzz {
    String fizz = "Fizz";
    public String countOff(int order) {
        if (order % 3 == 0) {

            return fizz;
        }
        return String.valueOf(order);
    }
}
