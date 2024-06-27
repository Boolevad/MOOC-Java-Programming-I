import java.util.Scanner;

public class UserInterface {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scan;
    
    public UserInterface(Scanner scanner, Container firstContainer, Container secondContainer) {
        this.scan = scanner;
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
    }    
    
    public void start() {
       
        while (true) {
            System.out.print("First: " + this.firstContainer + "\n");
            System.out.print("Second: " + this.secondContainer + "\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                this.firstContainer.add(amount);
            }
            if (command.equals("remove")) {
                this.secondContainer.remove(amount);
            }
            if (command.equals("move")) {
                
                if (this.firstContainer.contains() - amount >= 0) {
                    this.firstContainer.remove(amount);
                    this.secondContainer.add(amount);
                } else {
                    int moveBuffer = this.firstContainer.contains();
                    this.firstContainer.remove(this.firstContainer.contains());
                    this.secondContainer.add(this.firstContainer.contains() + moveBuffer);
                }
            } 
        }
    }

}
