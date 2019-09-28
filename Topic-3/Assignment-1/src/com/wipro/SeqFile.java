package com.wipro;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeqFile {
    public void writeToFile(String productId, Double cost, Integer noOfItems) throws IOException {


        Path path = Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\Assignment-1\\src\\testData.txt");
        if(!Files.exists(path))
            Files.createFile(Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\Assignment-1\\src\\testData.txt"));
        List<String> lines = new ArrayList<>();
        lines.add(productId+", " +cost+ ", " + noOfItems);

        Files.write(Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\Assignment-1\\src\\testData.txt"), lines, StandardOpenOption.APPEND);
    }

    public Double getCostList() throws IOException {
       List<String> lines = Files.readAllLines(Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\Assignment-1\\src\\testData.txt"));

        lines.forEach(line ->{
            String [] str = line.split(",");
                });
        Double sum = lines.stream()
                .mapToDouble(line ->{
                    String [] str = line.split(",");
                    return Double.parseDouble(str[1]);
                }).sum();
        return sum;
    }

    public void readAlternateLines() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\Assignment-1\\src\\testData.txt"));

        IntStream.range(0, lines.size())
                .filter(n -> n % 2 == 0)
                .mapToObj(lines::get).forEach(System.out::println);
    }
}
