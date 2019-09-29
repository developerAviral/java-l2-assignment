import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    List<Integer> studentMarksList = new ArrayList<Integer>(Arrays.asList(99,98,97,100,92,84,80,89,90));

    public double calculateAvg(){
        return studentMarksList.stream()
                .mapToInt(marks -> marks)
                .average().orElse(-1);
    }
}
