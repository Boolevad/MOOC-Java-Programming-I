import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> suitcase;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<>();
    }
    
    public int totalWeight() {
        int weight = 0;
        
        for (Item item: this.suitcase) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    public void addItem(Item item) {
        
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.suitcase.add(item);
        }    
    }
    
    public void printItems() {
        for (Item e: this.suitcase) {
            System.out.println(e);
        }
    }  
    
    public Item heaviestItem() {
        if (this.suitcase.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.suitcase.get(0);
        for (Item e: this.suitcase) {
            if (e.getWeight() >= heaviest.getWeight()) {
                heaviest = e;
            }
        }
        return heaviest;
    }
    
    public String toString() {
        
        if (this.suitcase.size() == 0) {
            return "no items (0 kg)";
        } else if (this.suitcase.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        } else {
            return suitcase.size() + " items (" + this.totalWeight() + " kg)";
        }
    }
}
