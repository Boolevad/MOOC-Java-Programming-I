import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase {
    
    private Scanner scanner;
    private ArrayList<Bird> birdDatabase;
    private boolean isBird;
    
    public BirdDatabase(Scanner scanner) {
        this.scanner = scanner;
        this.birdDatabase = new ArrayList<Bird>();
        this.isBird = false;
    }
    
    public void addBird() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();

        this.birdDatabase.add(new Bird(name, latinName));
    }
    
    public void addObservations() {
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        
        for (Bird bird:birdDatabase) {
            if (bird.getName().contains(name)) {
                bird.addObservations();
                this.isBird = true;
            }
        }
        if (!isBird) {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAll() {
        for (Bird bird: birdDatabase) {
            System.out.println(bird);
        }
    }
    
    public void printOne() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        for (Bird bird: birdDatabase) {
            if (bird.getName().contains(birdName)) {
                System.out.println(bird);
                this.isBird = true;
            }
        }
        if (!isBird) {
            System.out.println("Not a bird!");
        }
    }
}
