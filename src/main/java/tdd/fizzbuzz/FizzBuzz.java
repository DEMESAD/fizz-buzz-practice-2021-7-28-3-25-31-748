package tdd.fizzbuzz;

public class FizzBuzz {
    String fizz = "Fizz";
    String buzz = "Buzz";
    String fizzBuzz = "FizzBuzz";
    String whizz = "Whizz";
    String fizzWhizz = "FizzWhizz";
    String buzzWhizz = "BuzzWhizz";
    String fizzBuzzWhizz = "FizzBuzzWhizz";
    public String countOff(int order) {
        if (order % 3 == 0 && order % 5 == 0 && order % 7 == 00){


            return fizzBuzzWhizz;
        }
        if (order % 3 == 0 && order % 5 == 0){

            return fizzBuzz;
        }
        if (order % 3 == 0 && order % 7 == 0) {

            return fizzWhizz;
        }
        if (order % 5 == 0 && order % 7 == 0) {


            return buzzWhizz;
        }

        if (order % 3 == 0) {
            return fizz;
        }
        if (order % 5 == 0) {

            return buzz;
        }
        if (order % 7 == 0) {

            return whizz;
        }



        return String.valueOf(order);
    }
}
