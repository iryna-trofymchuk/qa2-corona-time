/**
 * Создать метод, который будет высчитывать конечную сумму,
 * которую будет необходимо заплатить человеку взявшему кредит на жильё
 * (в консоль распечатать стартовую сумму, сумму процентов и конечную сумму которую надо отдать)
 */
public class Credit {
    public int calculateFinalSum(int startSum, int percents) {
        int finalSum = startSum + percents;
        return finalSum;
    }

}
