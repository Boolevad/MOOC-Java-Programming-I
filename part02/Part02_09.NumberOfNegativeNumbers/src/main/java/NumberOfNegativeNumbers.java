
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number:");
            if (num < 0) {
                count = count + 1;
            }
            if (num == 0) {
                break;
            }
        
        }
        System.out.println("Number of negative numbers: " + count);    
    }
}
