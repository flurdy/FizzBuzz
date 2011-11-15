package model;

public class FizzBuzz {

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private static boolean isNeitherFizzNorBuzz(int i){
        return !FizzBuzz.isFizz(i) && !FizzBuzz.isBuzz(i);
    }

    public static String returnFizzBuzzOrCount(int i) {
        final StringBuffer output = new StringBuffer();
        if( isNeitherFizzNorBuzz(i) ){
            output.append(i);
        } else {
            if( FizzBuzz.isFizz(i) ){
                 output.append("Fizz");
            }
            if( FizzBuzz.isBuzz(i) ){
                 output.append("Buzz");
            }
        }
        return output.toString();
    }
}
