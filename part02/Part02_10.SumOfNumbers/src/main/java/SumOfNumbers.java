
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number:");
            if (num == 0) {
                break;
            }
            if (num != 0) {
                sum = sum + num;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
