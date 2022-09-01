package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
@Test
void should_return_1_when_count_off_given_number1(){
//given
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "1";

//when
    String actual = fizzBuzz.countOff(1);

//then
    assertEquals(expected, actual);
}


@Test
void should_return_Fizz_when_countOff_given_number_3(){
//given
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "Fizz";

//when
    String actual = fizzBuzz.countOff(3);


//then
    assertEquals(expected, actual);

}
@Test
void should_return_Buzz_when_countOff_given_number_5(){
//given
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "Buzz";

//when
    String actual = fizzBuzz.countOff(5);

//then
    assertEquals(expected, actual);
}

@Test
void should_return_FizzBuzz_when_countOff_given_number_15(){
//given
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "FizzBuzz";
//when
    String actual = fizzBuzz.countOff(15);
//then
    assertEquals(expected, actual);
}

@Test
void should_return_whizz_when_countOff_given_number_7(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    String expected = "Whizz";
//when
    String actual = fizzBuzz.countOff(7);
//then
    assertEquals(expected, actual);
}
@Test
void should_return_FizzWhizz_when_countOff_given_number_21(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzWhizz";
//when
        String actual = fizzBuzz.countOff(21);
//then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_BuzzWhizz_when_countOff_given_number_35(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "BuzzWhizz";
//when
        String actual = fizzBuzz.countOff(35);
//then
        assertEquals(expected, actual);
    }


}
