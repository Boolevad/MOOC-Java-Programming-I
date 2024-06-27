
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstContainer = 0;
        int secondContainer = 0;


        while (true) {
            System.out.print("First: " + firstContainer + "/100\n");
            System.out.print("Second: " + secondContainer + "/100\n");

            String input = scan.nextLine();
           
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add") && amount >= 0) {
                if (firstContainer + amount <= 100) {
                    firstContainer += amount;
                } else {
                    firstContainer = 100;
                }    
            }
            if (command.equals("move") && amount >=0) {          
                if (firstContainer - amount >= 0) {  //80 - 20
                    if (secondContainer + amount <= 100) {
                        secondContainer += amount;
                        firstContainer -= amount;
                    } else {
                        firstContainer = 0;
                        secondContainer = 100;
                    }
                    
                } else {
                    if (secondContainer + firstContainer <= 100) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    } else {
                        firstContainer = 0;
                        secondContainer = 100;
                    }    
                }
            }
            if (command.equals("remove")) {
                if (secondContainer - amount >= 0) {
                    secondContainer -= amount;                    
                }
            }
        }
    }

}
