import model.FizzBuzz;

public class FizzBuzzApplication {

    public static void main(String args[]){
        for(int i = 1; i<=100; i++){
            System.out.println( FizzBuzz.returnFizzBuzzOrCount(i) );
        }
    }

}
