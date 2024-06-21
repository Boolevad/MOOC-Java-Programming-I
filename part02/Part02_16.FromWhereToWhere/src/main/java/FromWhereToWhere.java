
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int high = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int low = Integer.valueOf(scanner.nextLine());
        if (low <= high) {
            for (int j = low; j <= high; j++) {
                System.out.println(j);
            }
        }
        
    }
}
