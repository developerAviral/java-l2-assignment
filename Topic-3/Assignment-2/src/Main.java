import jdk.nashorn.internal.parser.Parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        * Writing random 30 numbers in file
        * */
        Path path = Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\\\Assignment-2\\src\\Number.txt");
        if(!Files.exists(path))
            Files.createFile(Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\\\Assignment-2\\src\\Number.txt"));
        List<String> numberList = new ArrayList<>();
        Random rand = new Random();
        for(int i=0;i<30;i++) {
            int randNum = rand.nextInt(31);
            numberList.add(String.valueOf(randNum));
        }

        Files.write(Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\\\Assignment-2\\src\\Number.txt"), numberList);


        /*
        * Reading 30 numbers from file
        * */

        List<String> numberListFromFile = Files.readAllLines(Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\\\Assignment-2\\src\\Number.txt"));


        for(int i=10; i <= 30 ; i+=10){
            System.out.println();

            if(i == 10){
                numberListFromFile.stream()
                        .skip(0)
                        .limit(10)
                        .map(res -> res + " ")
                        .forEach(System.out::print);
            }
            else {
                numberListFromFile.stream()
                        .skip(i-10)
                        .limit(10)
                        .map(res -> res + " ")
                        .forEach(System.out::print);
            }
        }

        /*
        * Printing Average of numbers
        * */
        Double average = numberListFromFile.stream()
                .mapToDouble(num -> {
                    return Double.parseDouble(num);
                }).average().orElse(-1);

        System.out.println("\n\n Average of numbers : " + average);


        /*
         * Printing Sum of numbers
         * */
        int sum = numberListFromFile.stream()
                .mapToInt(num -> {
                    return Integer.parseInt(num);
                }).sum();

        System.out.println("Sum of numbers : " + sum);
    }
}
