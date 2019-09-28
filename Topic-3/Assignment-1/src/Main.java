import com.wipro.SeqFile;
import com.wipro.utils.ProductCrud;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int counter = 0;
        ProductCrud productCrud = new ProductCrud();

        while(true){
            counter++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter product id: ");
            String productId = scanner.next();

            System.out.println("Enter product cost: ");
            Double productCost = scanner.nextDouble();

            System.out.println("Enter no of items: ");
            Integer noOfItems = scanner.nextInt();
            productCrud.addProduct(productId, productCost, noOfItems);

            if(counter == 6)
                break;

            System.out.println("Do you want to add more products (true/false): ");
            if(!scanner.nextBoolean()){
                break;
            }
        }

        System.out.println("Total value of products: " + productCrud.getTotalValue());
        System.out.println("Printing alternate products: ");
        productCrud.displayAlternateProducts();

    }
}
