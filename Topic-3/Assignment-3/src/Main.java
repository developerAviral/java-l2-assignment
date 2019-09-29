import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Path sourceFilePath = Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\Assignment-3\\src\\sourceTestData.txt");
        Path destFilePath = Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\Assignment-3\\src\\destTestData.txt");

        if(!Files.exists(sourceFilePath))
            Files.createFile(Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\Assignment-3\\src\\sourceTestData.txt"));
        if(!Files.exists(destFilePath))
            Files.createFile(Paths.get("D:\\Study Materials\\Wipro\\TopGear\\java-l2-assignment\\Topic-3\\Assignment-3\\src\\destTestData.txt"));

        List<String> sourceLines = Files.readAllLines(sourceFilePath);
        //List destLines = null;

     //   String[] strDest = null;

        List<String> strDest = sourceLines.stream()
                .map( line ->{
                    line = line.replaceAll("\\s+","");
                    return line;
                }).collect(Collectors.toList());




        Files.write(destFilePath,strDest,StandardOpenOption.APPEND);
    }
}
