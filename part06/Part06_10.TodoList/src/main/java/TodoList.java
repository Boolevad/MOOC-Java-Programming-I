import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
        
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void print() {
        
        for (int i = 0; i < this.todoList.size(); i++) {
            
            int num = i + 1;
            System.out.println(num + ": " + this.todoList.get(i));
        }
        
    }
    
    public void remove(int number) {
            this.todoList.remove(number - 1);
    }
}
