import java.util.ArrayList;

public class RecipeBook {
    
    private ArrayList<Recipe> recipeBook;
    
    public RecipeBook() {
        this.recipeBook = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipeBook.add(recipe);
    }
    
    public void findName(String searchedName) {
        
        for (Recipe recipe: recipeBook) {
            if (recipe.getName().contains(searchedName)) {
                System.out.println(recipe);
            }    
        } 
    }
    
    public void findCookingTime(int maxTime) {
        
        for (Recipe recipe: recipeBook) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(String searchedIngredient) {
        
        for (Recipe recipe: recipeBook) {
            if (recipe.getIngredients().contains(searchedIngredient)) {
                System.out.println(recipe);
            }
        }    
    }
    
    public String toString() {
        
        String output = "Recipes:\n";
        for (Recipe recipe: recipeBook) {
            output += recipe + "\n";
        }     
        return output;
    }
}
