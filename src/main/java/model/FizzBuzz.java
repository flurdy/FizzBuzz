package model;

public class FizzBuzz {

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private static boolean isFizzBuzz(int i){
        return isFizz(i) && isBuzz(i);
    }

    public static String returnFizzBuzzOrCount(int i) {
        if( isFizzBuzz(i) ){
            return "FizzBuzz";
        } else if( isFizz(i) ){
            return "Fizz";
        } else  if( isBuzz(i) ){
            return "Buzz";
        } else {
            return ""+i;
        }
    }

}
