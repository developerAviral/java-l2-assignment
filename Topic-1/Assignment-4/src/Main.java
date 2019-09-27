import com.wipro.PrintDiamondPattern;
import com.wipro.exception.MyOwnNegativeValueEnteredException;
import com.wipro.exception.MyOwnZeroValueEnteredException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PrintDiamondPattern printDiamondPattern = new PrintDiamondPattern();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");
        int rows = input.nextInt();
        assert rows < 0 : "Negative number.";
        assert rows == 0 : "Zero number is not acceptable";
        try {
            printDiamondPattern.printPattern(rows);
        }
        catch (MyOwnZeroValueEnteredException| MyOwnNegativeValueEnteredException e){
            e.printStackTrace();
        }


    }
}
