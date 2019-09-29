import com.wipro.utils.StringObjects;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        StringObjects stringObjects = new StringObjects();
        List<String> stringList = stringObjects.createStringObjectsList();

        long countStringWithLenght = stringList.stream()
                                .filter(s -> s.length() > 5)
                                .count();
        long countEmptyString = stringList.stream()
                                           .filter(s -> s.isEmpty()).count();

        List<String> emptyStringList = stringList.stream()
                                                .filter(s -> s.isEmpty())
                                                .collect(Collectors.toList());

        System.out.println("no.strings whose length  is> 5 : " + countStringWithLenght);
        System.out.println(" no.of empty strings :" + countEmptyString);
        System.out.println("List of empty string: "+ emptyStringList);
    }
}
