import org.junit.jupiter.api.Test;

public class MyFirstTest {

    private String name = "Gospodin";

    @Test
    public void firstTest() {
        System.out.println("Hello, corona!");

        int sum = sumTwoDigits(56, 45);
        System.out.println(sum);

        System.out.println(sumTwoDigits(9, 13));
        System.out.println(name);
    }

    @Test
    public void myCreditTest() {
        int startSum = 120000;
        System.out.println("Start Sum " + startSum);
        int percents = 40000;
        System.out.println("Percents " + percents);
        int finalSum = sumTwoDigits(startSum, percents);
        System.out.println("Final Sum " + finalSum);
    }

    private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;
    }
}
