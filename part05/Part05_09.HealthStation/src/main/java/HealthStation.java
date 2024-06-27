
public class HealthStation {
    private int weightings;
    
    public HealthStation() {
        this.weightings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weightings++;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }   
    public int weighings() {
        return this.weightings;
    }

}
