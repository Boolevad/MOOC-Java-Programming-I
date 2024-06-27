import java.util.ArrayList;

public class Bird {
    
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public void addObservations() {
        this.observations++;
    }
    
    public String toString() {
        return name + " (" + latinName + "): " + observations + " observations";
    }
}
