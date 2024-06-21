
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number:");
            if (num == 0) {
                break;
            }
            if (num != 0) {
                sum = sum + num;
                count = count + 1;
            }
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

    }
}
