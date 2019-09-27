import com.wipro.A;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        A a = new A();
        a = new A();
        a = new A();

        Runtime.getRuntime().gc();

        Thread.sleep(5000);
        System.out.println("No of finalized method called: " + A.noOfFinalizeMethodCalled);
    }
}
