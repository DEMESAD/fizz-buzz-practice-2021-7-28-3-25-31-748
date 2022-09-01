package tdd.fizzbuzz;

public class FizzBuzz {
    String fizz = "Fizz";
    public String countOff(int order) {
        if (order % 3 == 0) {
            return fizz;
        } else if (order % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(order);
    }
}
