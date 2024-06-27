import java.util.ArrayList;

public class Hold {
    
    private ArrayList<Suitcase> hold;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.hold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        
        int weight = 0;
        for (Suitcase lug: this.hold) {
            weight += lug.totalWeight();
        }
        return weight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.hold.add(suitcase);
        }
    }
    
    public String toString() {
        return hold.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase lug: this.hold) {
            lug.printItems();
        }
    }
    
}
