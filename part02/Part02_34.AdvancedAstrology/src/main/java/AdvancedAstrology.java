
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        String star = "";
        for (int i = 1; i <= number; i++) {
            System.out.print(star + "*");            
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String space = "";
        for (int i = 1; i <= number; i++) {
            System.out.print(space + " ");            
        }
    }


    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaces = size - 1;
        for (int stars = 1; stars <= size; stars++) {
            
            printSpaces(spaces);
            printStars(stars);
            spaces--;           
        }       
    }
    
    public static void christmasTree(int height) {
        // part 3 of the exercise
        int spaces = height - 1;
        int stars = 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(spaces);
            printStars(stars);
            stars = stars + 2;
            spaces--;
        }
        for (int j = 1; j <= 2; j++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
