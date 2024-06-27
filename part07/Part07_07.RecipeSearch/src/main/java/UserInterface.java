import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class UserInterface {
    
    private Scanner scanner;
    private RecipeBook recipeBook;
    
    public UserInterface(Scanner scanner, RecipeBook recipeBook) {
        this.scanner = scanner;
        this.recipeBook = recipeBook;
    }
    
    public void start() {
        
        String filename = filename();
        
        commandMenu();
        readRecipes(filename);
        System.out.println("");
        
        while (true) {
            
            System.out.print("Enter command: ");         
            String userCommand = scanner.nextLine();
            System.out.println("");
            if (userCommand.equals("stop")) {
                break;
                
            } else if (userCommand.equals("list")) {
                listRecipes();
                
            } else if (userCommand.equals("find name")) {
                findByName();
                
            } else if (userCommand.equals("find cooking time")) {
                findByCookingTime();
                
            }else if (userCommand.equals("find ingredient")) {
                findByIngredient();
                
            }
            
        }
    } 
    
    public String filename() {
        
        System.out.print("File to read: ");
        String filename = scanner.nextLine();
        System.out.println("");
        return filename;
    }
    
    public void commandMenu() {
        
        System.out.println("Commands:\n" +
        "list - lists the recipes\n" +
        "stop - stops the program\n" +
        "find name - searches recipes by name\n" + 
        "find cooking time - searches recipes by cooking time\n" + 
        "find ingredient - searches recipes by ingredient\n");
    }
    
    public void readRecipes(String filename) {
        
        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
            
            while (fileScanner.hasNextLine()) {
               
                String name = fileScanner.nextLine();
                int cookingTime = Integer.valueOf(fileScanner.nextLine());
                
                ArrayList<String> ingredientList = new ArrayList<String>();
                
                while (fileScanner.hasNextLine()) {
                    
                    String ingredient = fileScanner.nextLine();
                    
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    
                    ingredientList.add(ingredient);
                }
                Recipe recipe = new Recipe(name, cookingTime, ingredientList);
                recipeBook.addRecipe(recipe);
                
            } 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }        
    }
    
    public void listRecipes() {
        System.out.println(recipeBook);
    }
    
    public void findByName() {

        System.out.print("Searched word: ");
        String searchedName = scanner.nextLine();
        System.out.println("");
        
        System.out.println("Recipes: ");
        recipeBook.findName(searchedName);
        System.out.println("");        
    }
    
    public void findByCookingTime() {
        
        System.out.print("Max cooking time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        
        System.out.println("Recipes: ");
        recipeBook.findCookingTime(maxTime);
        System.out.println("");
    }
    
    public void findByIngredient(){ 
        
        System.out.print("Ingredient: ");
        String searchedIngredient = scanner.nextLine();
        System.out.println("");
        
        System.out.println("Recipes: ");
        recipeBook.findIngredient(searchedIngredient);
        System.out.println("");
    }
}