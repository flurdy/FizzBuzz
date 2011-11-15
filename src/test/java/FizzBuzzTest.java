import model.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzingAt3(){
        assertEquals("Fizz", FizzBuzz.returnFizzBuzzOrCount(3));
    }

    @Test
    public void fizzingAt6(){
        assertEquals("Fizz", FizzBuzz.returnFizzBuzzOrCount(6));
    }

    @Test
    public void buzzingAt5(){
        assertEquals("Buzz", FizzBuzz.returnFizzBuzzOrCount(5));
    }

    @Test
    public void fizzBuzzingAt15(){
        assertEquals("FizzBuzz", FizzBuzz.returnFizzBuzzOrCount(15));
    }

    @Test
    public void fizzBuzzingAt30(){
        assertEquals("FizzBuzz", FizzBuzz.returnFizzBuzzOrCount(30));
    }

    @Test
    public void isCountingAt1(){
        assertEquals("1", FizzBuzz.returnFizzBuzzOrCount(1));
    }


    @Test
    public void isCountingAt7(){
        assertEquals("7", FizzBuzz.returnFizzBuzzOrCount(7));
    }

    @Test
    public void isFizzingAt99(){
        assertEquals("Fizz", FizzBuzz.returnFizzBuzzOrCount(99));
    }

    @Test
    public void isFizzingAt100(){
        assertEquals("Buzz", FizzBuzz.returnFizzBuzzOrCount(100));
    }

    @Test
    public void isCountingAt101(){
        assertEquals("101", FizzBuzz.returnFizzBuzzOrCount(101));
    }

    @Test
    public void isCountingAtMinus1(){
        assertEquals("-1", FizzBuzz.returnFizzBuzzOrCount(-1));
    }

    @Test
    public void isFizzBuzzAt0(){
        assertEquals("FizzBuzz", FizzBuzz.returnFizzBuzzOrCount(0));
    }

    @Test
    public void printOneToHundred(){
        for(int i = 1; i<=100; i++){
            System.out.println( FizzBuzz.returnFizzBuzzOrCount(i) );
        }
    }

}
