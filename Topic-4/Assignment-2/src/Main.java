import com.wipro.WordCount;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        WordCount wordCount = str ->{
            return (int )Arrays.stream(str.split(" ")).count();
        };

        System.out.println("Word counts : " + wordCount.count("Hello my dear Anima"));
    }
}
