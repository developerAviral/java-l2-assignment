import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Number[] numberArray = new Number[5];
        numberArray[0] = 1;
        numberArray[1] = 1.2;
        numberArray[2] = 134L;

        //Gives compilation error if value stored other than int,float,double etc.
        //numberArray[3] = "String";

        numberArray[4] = 1.567D;

        for (Number n : numberArray){
            System.out.println(n);
        }
    }
}
