
public class Statistics {
    private int sum;
    private int count;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        this.count++;  
        this.sum += number;       
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (sum() == 0) {
            return 0;
        }
        return (1.0 * this.sum / this.count);   
    }
}
