import com.wipro.util.ObjectsCounter;

public class Main {

    public static void main(String[] args) {
        ObjectsCounter objectsCounter;
        for(int i=0; i<10; i++){
            objectsCounter = new ObjectsCounter();
        }

        System.out.println("Number of Objects created : " + ObjectsCounter.getNumberOfObjects());

    }
}
