
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String answer = scanner.nextLine();
            System.out.println("Shall we carry on?");
            if (answer.equals("no")) {
                break;
            }
        }    
    }
}
