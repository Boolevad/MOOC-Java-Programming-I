import java.util.ArrayList;

public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
 
    public Recipe(String name, int cookingTime, ArrayList<String> ingrediendList) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingrediendList;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCookingTime() {
        return cookingTime;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public String printIngredients() {
        String ingredientsString = "";
        for (String i: ingredients) {
            ingredientsString += i + "\n";
        }      
        return ingredientsString;
    }
    
    public String toString() {
        
        return this.name + ", cooking time: " + this.cookingTime;
    }    
}

