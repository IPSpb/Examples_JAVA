package circle;

/**
 * Created by IPopov on 29.04.2014.
 */
public class WhileDoWhile {
    public void whileTest() {
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }

    public void doWhileTest() {
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
