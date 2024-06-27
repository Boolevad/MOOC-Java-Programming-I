
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        BirdDatabase birdDatabase = new BirdDatabase(scan);
        
        while (true) {
            
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Add")) {
                birdDatabase.addBird();
                
            } else if (command.equals("Observation")) {
                birdDatabase.addObservations();
                
            } else if (command.equals("All")) {
                birdDatabase.printAll();
                
            } else if (command.equals("One")) {
                birdDatabase.printOne();
                
            } else if (command.equals("Quit")) {
                break;
            }
            
        }

    }

}
