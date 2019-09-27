import com.wipro.Week;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter the number of Day: ");
        Week week = new Week();
        Scanner input = new Scanner(System. in);
        int i = input.nextInt();
        week.getDay(i);
    }
}
