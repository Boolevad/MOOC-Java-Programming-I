import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        while (true) {
            
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                this.todoList.add(toAdd);
            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int removeID = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(removeID);
            }
        }   
    }
}
