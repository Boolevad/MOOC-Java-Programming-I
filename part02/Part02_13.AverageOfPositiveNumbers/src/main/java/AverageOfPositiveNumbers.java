
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());            
            if (num == 0) {
                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                }
                break;
            }
            if (num > 0) {
                sum = sum + num;
                count = count + 1;
            }
        }
        double average = (double) sum / count;
        System.out.println("Average of the numbers: " + average);

    }
}