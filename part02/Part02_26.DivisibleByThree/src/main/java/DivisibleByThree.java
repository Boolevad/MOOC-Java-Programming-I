
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning % 3 != 0) {
            beginning++;
        }
        for (int i = beginning; i <= end; i = i + 3) {
            System.out.println(i);
        }           
    }
}
