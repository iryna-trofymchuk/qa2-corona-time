import org.junit.jupiter.api.Test;

public class HomeWork {
    @Test
    public void myCreditTest(){
        int startSum = 120000;
        System.out.println("Start Sum " + startSum);
        int percents = 40000;
        System.out.println("Percents " + percents);
        int finalSum = startSum + percents;
        System.out.println("Final Sum " + finalSum);
    }
    /**
     * Создать метод, который посчитает количество символов в любой строке и выведит его
     *     *** дополнительно посчитает количество слов и выведет его
     */
    @Test
    public void countCharacters(){
        String string = "Such a wonderful world";
        int lenght = string.length();
        System.out.println("String " + string + " has lenght " + lenght);
        int words = string.split(" ").length;
        System.out.println("words " + words);

    }
}


