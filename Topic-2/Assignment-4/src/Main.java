import java.util.Currency;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Get Input from User
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three currencies symbol  {Eg: USD, JPY, AUD}: ");
        String currency1 = scanner.next();
        String currency2 = scanner.next();
        String currency3 = scanner.next();

        // Use of getInstance() method to 'AUD' ,USD etc instance
        Currency c1 = Currency.getInstance(currency1);
        Currency c2 = Currency.getInstance(currency2);
        Currency c3 = Currency.getInstance(currency3);

        // Use of getCurrencyCode() method
        String cCode1 = c1.getCurrencyCode();
        String cCode2 = c2.getCurrencyCode();
        System.out.println("Currency 1 code : " + cCode1);
        System.out.println("Currency 2 code : " + cCode2);
        System.out.println("");

        // Use of getDefaultFractionDigits() method
        int D1 = c1.getDefaultFractionDigits();
        System.out.println("Currency 1 Fraction digits : " + D1);

        int D2 = c2.getDefaultFractionDigits();
        System.out.println("Currency 2 fraction digits : " + D2);
        System.out.println("");

        // Use of getDisplayName() method
        System.out.println("Currency 1 Display : "+c1.getDisplayName());
        System.out.println("Currency 2 Display : "+c2.getSymbol());
        System.out.println("");

        // Use of getSymbol() method
        System.out.println("Currency 2 Symbol : "+c2.getSymbol());
        System.out.println("Currency 3 Symbol : "+c3.getSymbol());
    }
}
