import com.wipro.ImplClassWithLambda;

public class Main {

    public static void main(String[] args) {

        ImplClassWithLambda implClassWithLambda = new ImplClassWithLambda();
        char c = 'o';
        int occurence = implClassWithLambda.getCharacterOccurrence("Hello World!", c);
        System.out.println("Character " + c + " is occured " +occurence + " times.");
    }
}
