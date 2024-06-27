
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int priceOfThis = this.squares * this.pricePerSquare;
        int priceOfCompared = compared.squares * compared.pricePerSquare;
        return (Math.abs(priceOfCompared - priceOfThis));
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceOfThis = this.squares * this.pricePerSquare;
        int priceOfCompared = compared.squares * compared.pricePerSquare;
        if (priceOfThis > priceOfCompared) {
            return true;
        }
        return false;
    }
}
