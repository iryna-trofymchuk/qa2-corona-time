import org.junit.jupiter.api.Test;

public class CreditTest {
    @Test
    public void calculateFinalSumTest() {
        Credit myCredit = new Credit();

        int startSum = 120000;
        int percents = 40000;

        int finalSum = myCredit.calculateFinalSum(startSum, percents);

        System.out.println("Start Sum " + startSum);
        System.out.println("Percents " + percents);
        System.out.println("Final Sum " + finalSum);
    }
}
